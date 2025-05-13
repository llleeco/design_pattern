package adapter.adapter1;

//Adapter
public class PrintBanner extends Banner implements Print{

    //부모 클래스의 default 생성자가 없음
    //그러면 자식 클래스에서 부모 클래스 default 생성자 호출
    //->에러
    //default 생성자 호출하지 않도록
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
