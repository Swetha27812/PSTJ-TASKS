package Tasks;
class AddSub{
   public int Addsub(int input1,int input2){
	int N =input1;
    int opt =input2;
     int result=N;
     boolean add=(opt==2);
     for (int i =N-1;i>=1;i--){
         if (add){
             result+=i;
         }else{
             result-=i;
         }
         add=!add;
     }
     System.out.println(result);
     return result;

}
}


