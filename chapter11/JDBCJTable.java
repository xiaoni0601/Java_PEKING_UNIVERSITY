import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.sql.*;
import java.util.*;

import javax.swing.table.*;

class JDBCJTable extends JFrame
{
	AbstractTableModel tm;
	JTable table;
	JScrollPane scrollpane;
	String titles[];
	Class colClasses[];
	Vector<Vector<Object>> records;

	public void initTablModel(){
		records = new Vector<>();
		tm = new AbstractTableModel(){
			public int getColumnCount(){
				return titles.length;
			}
			public int getRowCount(){
				return records.size();
			}
			public Object getValueAt(int row,int column){
				if(!records.isEmpty())
					return ((Vector)records.elementAt(row)).elementAt(column);
				else
					return null;
			}

			public String getColumnName(int column){
				return titles[column];
			}

			public Class getColumnClass(int column){
				//return getValueAt(0,column).getClass();
				return colClasses[column];
			}

			public void setValueAt(Object value,int row,int column){

			}
			public boolean isCellEditable(int row,int column){
				return false;
			}
		};
	}

	public void showData() throws SQLException, ClassNotFoundException{


		Class.forName("org.sqlite.JDBC");


		String connString = "jdbc:sqlite:d:/test3.db";
		Connection connection = DriverManager.getConnection(connString);


		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select * from people");
		ResultSetMetaData meta = rs.getMetaData();


		int colCnt = meta.getColumnCount();
		System.out.println( colCnt );
		titles = new String[ colCnt ];
		colClasses = new Class[ colCnt ];
		for( int i=0; i<colCnt; i++){
			titles[i] = meta.getColumnName(i+1);
			String className =  meta.getColumnClassName(i+1);
			Class clz = String.class;
			if(className!=null) try
			{
				clz = Class.forName(className);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
			colClasses[i] =	clz; 
		}

		records.removeAllElements();
		while(rs.next()){
			Vector<Object> rec_vector=new Vector<>();

			for ( int i=0; i<titles.length; i++ ){
				Object obj = rs.getObject(i+1);
				System.out.print(obj+";");
				rec_vector.addElement(obj==null?null:obj.toString());
			}
			records.addElement(rec_vector);
			System.out.println();
		}


		table=new JTable();
		table.setToolTipText("��ʾȫ����ѯ���");
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setCellSelectionEnabled(false);
		table.setShowVerticalLines(true);
		table.setShowHorizontalLines(true);
		
		
		scrollpane=new JScrollPane(table);
		getContentPane().add( scrollpane );

		table.setModel(tm);
		tm.fireTableStructureChanged();
		
		//JTable(TableModel dm)
		//JTable(Object[][] rowData, Object[] columnNames) )
		//JTable(Vector rowData, Vector columnNames) 		
	}

	public static void main( String [] args ){
		SwingUtilities.invokeLater(()->{
			JDBCJTable f = new JDBCJTable();
			f.initTablModel();
			try{
				f.showData();
			}catch( Exception e){ e.printStackTrace(); }
			f.setSize( 400,300);
			f.setTitle( "Show Database table in JTable" );
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setVisible(true);
		});
	}

}



