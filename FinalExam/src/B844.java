import java.util.Stack;

public class B844 {
    public static void main(String[] args) {
        String s1  = "ab#c";
        String s2 = "ad#c";
        System.out.println(backspaceCompare(s1,s2));
    }
    public static boolean backspaceCompare(String s, String t){
        Stack<Character> s1 = new Stack<Character>(); // khởi tạo 2 Stack để chứa các ký tự char trong 2 chuỗi
        Stack<Character> s2 = new Stack<Character>(); // độ phực tạp không gian : O(1)
        for(char ch : s.toCharArray()){ // duyệt phần tử và loại bỏ ký tử trong 2 chuỗi , nếu gặp # thì bỏ ra ,
            if(ch == '#'){
                if(!s1.isEmpty())
                    s1.pop();
                continue;
            }
            s1.push(ch); // không phải các ký tự thì push vào để hoàn thành chuối Stack ko có chưa kí tử
        }
        for(char ch : t.toCharArray()){ // Độ phức tạp thời gian : O(n)
            if(ch == '#'){
                if(!s2.isEmpty())
                    s2.pop();
                continue;
            }
            s2.push(ch);
        }
        String sOne = ""; //khởi tạoh 2 chuỗi String để lưu giá trị
        String sTwo = "";
        while(!s1.isEmpty()) // duyệt vào cộng chuỗi cho đến khi hết Stack
            sOne += s1.pop(); // lấy ra rồi xóa phần tử trong Stack
        while(!s2.isEmpty())
            sTwo += s2.pop();
        return sOne.equals(sTwo); // so sánh kqua 2 chuỗi
    }
    // độ phực tạp không gian :  vì chỉ khởi tạo dựa trên số mảng đề bài cho , khá ít nên là O(1)
    // Độ phức tạp thời gian : vì phải duyệt để loại bỏ # ở cả 2 mảng : O(n)
}
