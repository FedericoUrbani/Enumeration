public class Main {
    enum EnumMonth {

        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December

    }

    public static void main(String[] args) {

        for (EnumMonth month: EnumMonth.values()){
            String support=month.toString();
            char y='y';
            if (support.charAt(support.length()-1)==y){
                System.out.println(month+" month end with y");
            }else{
                System.out.println(month+" month doesn't end with y");
            }
        }
    }
}
