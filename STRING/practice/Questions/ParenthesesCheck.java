public class ParenthesesChk {

    public static void main(String[] args) {

         String  value = "([]) }" ;

        String temp=value;

        while(temp.contains("()") || temp.contains("{}") || temp.contains("[]")){
            temp = temp.replace("()","")
                    .replace("{}","")
                    .replace("[]","");
        }

        System.out.println(temp.isEmpty());
        
}

}
