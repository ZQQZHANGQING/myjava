package OOP;

public class BookTest {
    /*
    基本信息包括图书名称（bookName）、总页数（pagelbtalNum），其中页数不能少于 200 页，
    否则输出错误信息，并赋予默认值 200。为各个属性设置赋值和取值方法。
     具有 details() 方法，该方法在控制台输出每本图书的名称和总页数。
     编写 BookTest 测试类，为 Book 对象的属性赋予初始值，并调用 details() 方法输出详细信息
     */
    private String bookName;
    private int pagelbtalNum;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPagelbtalNum(int pagelbtalNum) {
        if(pagelbtalNum<200){
            System.out.println("不能低于200页");
            this.pagelbtalNum=200;
        }else{
            this.pagelbtalNum = pagelbtalNum;
        }
    }

    public int getPagelbtalNum() {
        return pagelbtalNum;
    }

    public String getBookName() {
        return bookName;
    }
    public void details(){
        System.out.println("图书名称:"+bookName+" 页数"+pagelbtalNum);
    }

    public static void main(String[] args) {
        BookTest mybook = new BookTest();
        mybook.setBookName("java程序设计");
        mybook.setPagelbtalNum(299);
        mybook.details();

        long value = (int)8.7;
        value %= 3;
        System.out.println(value);

    }
}
