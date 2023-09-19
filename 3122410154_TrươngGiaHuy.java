import java.util.Scanner;

public class test {
    static Scanner i=new Scanner(System.in);
    public static boolean nguyento(int nt)
    {
        if(nt<2) return false;
        for(int j=2;j<=(int)Math.sqrt(nt);j++)
        {
            if(nt%j==0) return false;
        }
        return true;
    }

     public static boolean odd_even(int n)
    {
        if(n%2==0) return true;
        return false;
    }

    public static void cau1()
    {
        System.out.println("nhap vao a va b cho cau 1: ");
        int a=i.nextInt();
        int b=i.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((float)a/b);
        System.out.println("cau 1: ");
    }

    public static void cau2(){
        System.out.println("nhap chieu rong va chieu cao : ");
        int r=i.nextInt();
        int c=i.nextInt();
        System.out.println("dien tich: "+r*c);
        System.out.println("chu vi : "+(r+c)*2);
    }

    public static void cau3()
    {
        System.out.println("nhap ban kinh: ");
        int bk=i.nextInt();
        System.out.println("dien tich hinh tron: "+Math.pow(bk,2)*3.14);
        System.out.println("chu vi hinh tron : "+(float)2*3.14*bk);
    }

    public static void cau4()
    {
        System.out.println("nhap so nguyen de test chan le : ");
        int n=i.nextInt();
        if(n%2==0) System.out.println("day la so chan .");
        else System.out.println("day la so le .");
    }

    public static void cau5()
    {
        System.out.println("nhap so nguyen de test am/zero/duong: ");
        int j=i.nextInt();
        if(j>=0){
            if(j==0)System.out.println("day la so 0");
            else System.out.println("day la so duong.");
        }
        else System.out.println("day la so am.");
    }

    public static void cau6()
    {
        System.out.println("cau 6: ");
        System.out.println("nhap so nguyen de test co phai so nguyen to hay khong: ");
        int nt=i.nextInt();
        if(nguyento(nt)==true){
            System.out.println("day la so nguyen to .");
        } 
        else 
        {
            System.out.println("day khong phai la so nguyen to ");
        }
    }

    public static void cau7()
    {
        System.out.println("nhap n cho cau 7: ");
        int n=i.nextInt();
        int sum=0;
        int sum_chan=0;
        int sum_le=0;
        int sum_nguyento=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
            System.out.print(i+" ");
        }
        System.out.println("cac so chan nho hon n la : ");
        for(int i=1;i<=n;i++)
        {
            
            if(odd_even(i)==true)
            {
                sum_chan+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println("Cac so le nho hon n la : ");
        for(int i=1;i<=n;i++)
        {
            if(odd_even(i)==false)
            {
                sum_le+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println("Cac so nguyen to nho hon n la : ");
        for(int i=1;i<=n;i++)
        {
            if(nguyento(i)==true)
            {
                sum_nguyento+=i;
                System.out.print(i+" ");
            }
        }
        int dem=0;
        System.out.println("\nN so nguyen to dau tien la : ");
        int j=2;
        while(dem<n)
        {
            if(nguyento(j)==true)
            {
                System.out.print(j+" ");
                ++dem;
            }
            ++j;
        }
        System.out.println("\ntong cac so chan nh hon n la : "+sum_chan);
        System.out.println("tong cua cac so nho hon n la : "+sum);
        System.out.println("tong cac so LE nho hon n la : "+sum_le);
        System.out.println("tong cac so nguyen to nho hon n la: "+sum_nguyento);
    }


    public static void cau8() {
        int  tongA=0, tongChan = 0, tongNT=0, tongLe = 0; int max = 100;
        Scanner scanner = new Scanner(System.in);
        int A[] = new int[max];
        
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        System.out.println("Nhap mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        System.out.print("xuat=");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        //cau a:
        for(int i=0; i<n; i++){
             tongA += A[i];
        }
        System.out.print("\ntong mang= "+ tongA);
            

    // cau b,c,d

        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                tongChan += A[i];
            } else {
                tongLe += A[i];
            }
            if(nguyento(A[i])){
                tongNT+=A[i];
            }
        }
   
      
        System.out.println("\nTong chan= " + tongChan);
        System.out.println("Tong le= " + tongLe);
        System.out.println("Tong nt= " + tongNT);
        

      // cau e
        System.out.print("\nnhap pt moi: ");
        int ptmoi=scanner.nextInt();
        int[] newA = new int[n+1];
        for(int i=0; i<n; i++){
            newA[i]= A[i];
        }
        newA[n]=ptmoi;
        System.out.print("mang moi: ");
        for (int i = 0; i < n+1; i++) {
            System.out.print(newA[i] + " ");
        }
      
    // cau f
        System.out.print("\nnhap k= ");    
        int k=scanner.nextInt();
        if(k>=0 && k<n){
            for(int i=k; i<n; i++){
                newA[i]=newA[i+1];
            }
            n--;
            System.out.print("mang sau xoa: ");
            for(int i=0; i<n+1; i++){
            System.out.print(newA[i]+ "  ");
            }
        }
        else
        System.out.print(" ko hop le!");
        System.out.print(" \nnhap x= ");
        int x=scanner.nextInt();
        for(int i=0; i<n+1; i++){
            if(newA[i]==x){
                System.out.println("vi tri: "+i + " ");
            }
        }
        scanner.close();
    }


    public static void cau9(){
        System.out.print("nhap chuoi s: ");
        String s=i.nextLine();
        System.out.println("do dai chuoi s: "+s.length());
        String cleaned=s.trim().replaceAll("\\s+"," ");
        //trim():xoa khoang trang dau va cuoi chuoi.
        //replaceALL thay the chuoi dang truoc bang chuoi dang sau.
        int count=0;
        String []word = s.split(" ");
        for(String ss : word)
        {
            System.out.print(ss+" ");
            ++count;
        }
        System.out.println(cleaned);
        System.out.println("so tu co trong chuoi la : "+count);
        System.out.println("nhap k : ");
        int k=i.nextInt();
        String lefString=s.substring(0, k);
        String rightString=s.substring(s.length()-k,s.length());
        System.out.println("cac tu ben trai "+k+" : "+ lefString);
        System.out.println("cac tu ben phai "+k+" : "+rightString);
        System.out.println("nhap n : ");
        int n=i.nextInt();
        String Nstring=s.substring(s.length()-k,k+n);
        System.out.println("n sub string: "+ Nstring);
    }

    public static void menu()
    {
        while(true)
        {
            for(int i=1;i<=9;i++)
        {
            System.out.println("chon "+i+" de compile cau "+i+" : ");
        }
        System.out.println("chon '0' de dung chuong trinh.");
            int choice=i.nextInt();
            switch(choice)
            {
                case 1: cau1();break;
                case 2:cau2();break;
                case 3:cau3();break;
                case 4:cau4();break;
                case 5:cau5();break;
                case 6:cau6();break;
                case 7:cau7();break;
                case 8:cau8();break;
                case 9:cau9();break;
                case 0:System.out.println("Exited.");System.exit(0);break;
            }
        }
    }



    public static void main(String[] args)
    {
       menu();
    }
}
