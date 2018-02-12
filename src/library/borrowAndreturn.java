package library;
/**
 * 
 * @author cifengwang
 *
 */

public interface borrowAndreturn {
	Books book1=new Books(1,"黎曼几何","卡莫",(float)40.4,false);
	Books book2=new Books(2,"离散数学及其应用","Rosen",(float)96.7,false);
	Books book3=new Books(3,"浮生六记","沈复",(float)16.0,false);
	Books book4=new Books(4,"皮囊","蔡崇达",(float)26.7,false);
	Books book5=new Books(5,"我们仨","杨绛",(float)16.1,false);
	Books[] Library= {book1,book2,book3,book4,book5};
	public abstract void borrowBook(String title);
	public abstract void borrowBook(int id);
	public abstract void returnBook(String title);
	public abstract void returnBook(int id);

}
