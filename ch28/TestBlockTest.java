package ch28;

// Text block 사용하기
// 문자열을 """사이에 이어서 만들수있음

public class TestBlockTest {
    public static void main(String[] args) {

        String testBlocks = """
                Hello,
                Hi,
                Nice 2 meet u
                How r u
                """;

        System.out.println(testBlocks);
        System.out.println(getBlockHtml());
    }

    public static String getBlockHtml(){
        return """
                 <html>
                                
                		                <body>
                		                    <span>example text</span>
                		                </body>
                		            </html>
                """;
    }
}
