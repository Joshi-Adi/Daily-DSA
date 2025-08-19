class GfG {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in)
        int n = sc.nextInt();
        if ((n & 1) == 0)   // taking bitwise and of n with 1 
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
