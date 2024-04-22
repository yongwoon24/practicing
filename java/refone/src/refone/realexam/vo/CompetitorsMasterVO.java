package refone.realexam.vo;

public class CompetitorsMasterVO {
	private int c_code;
	private String c_name;
	private String addr;
	private long y_sales;
	private int emp_cnt;
	private String t_num;
	private String p_num;
	
	public CompetitorsMasterVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompetitorsMasterVO(int c_code, String c_name, String addr, long y_sales, int emp_cnt, String t_num,
			String p_num) {
		super();
		this.c_code = c_code;
		this.c_name = c_name;
		this.addr = addr;
		this.y_sales = y_sales;
		this.emp_cnt = emp_cnt;
		this.t_num = t_num;
		this.p_num = p_num;
	}
	
	
}
