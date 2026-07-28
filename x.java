class x{
    public void box(int xx,int y,int w,int h){
        String xxx="\033[40;30m";
        String www="\033[47;30m";
        int x1=0;
        for(x1=0;x1<xx;x1++)xxx=xxx+" ";
        for(x1=0;x1<w;x1++)www=www+" ";
        www=xxx+www;
        System.out.println("\033c\033[47;30m\ninvoke box \n");
        for(x1=0;x1<y;x1++)System.out.println("");
        for(x1=0;x1<w;x1++)System.out.println(www);
            
        


    }

}