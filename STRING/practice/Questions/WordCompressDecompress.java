public class WordCompressDecompress {



    public static String compression(String persons){         
        String words[] = persons.toUpperCase().trim().split("\\s+");
        int counter=1;
        StringBuffer stb = new StringBuffer();
        String seened="";


   
       
        for(int i=0;i<words.length;i++){
            counter=1;

            for(int j=i+1;j<words.length;j++){

                if(words[i].equals(words[j])){

                    counter++;



                }
                


            }  

            if(!(seened.contains(words[i].trim()))){
    
                stb.append(words[i]).append(" ").append(counter).append(" ");

            }
            seened = seened + " " +words[i].trim();

        }

        return stb.toString();


    }  

    public static boolean isAlphabetic(String str) {

        return str.matches("[a-zA-Z-]+");
    }

    public static boolean isDigit(String num) {
         boolean isDigit = String.valueOf(num).trim().matches("\\d+");
         return isDigit;
    }
    


    public static void decompression(String compress_string){

        StringBuffer stb = new StringBuffer();

        String words[] = compress_string.trim().split("\\s+");


        for(int i=0;i<words.length - 1;i++) {


            if( isAlphabetic(words[i]) &&  isDigit(words[i+1])){

                int iteration = Integer.valueOf(words[i+1]);


                for(int j=0;j<iteration;j++){
                    stb.append(words[i]).append(" ");


                }

            }


            if(i > 0 && isDigit(words[i]) && isDigit(words[i-1]) ){
                
                if(isDigit(words[i]) && isAlphabetic(words[i+1])){
                    
                    continue;
                }
                stb.append(words[i]).append(" ");
            }

            


          
        }   

     System.out.println("\nDecompress word: ");
     System.out.println(stb);


        
    }


    public static void main(String[] args) {
    

        String persons = "tarika-sharma ankush-verma janvi-gupta tarika-sharma janvi-gupta ankush-verma minakshi ankush-verma tarika-sharma tarika-sharma rohit-singh neha-patel rohit-singh simran-rai rohit-singh neha-patel simran-rai ankush-verma tarika-sharma jatin-suri manisha-mittal manisha-mittal jatin-suri rohit-singh";

        persons = persons.trim();
         System.out.printf("REAL STRING\n%s\n",persons);




      
        String compress_string = compression(persons);
         System.out.printf("\nCompressed STRING\n%s\n",compress_string);

        decompression(compress_string);



        
    }
    
}
