class Days{

     public static void main(String[] args) {


        int day = 2;
        String result = "";


         result = switch(day)
         {
            case 2,5-> "rohith";
            case 4 -> "laddu";
            default -> "vennis";

         };

         System.out.println(result);



        
    }
}
           

