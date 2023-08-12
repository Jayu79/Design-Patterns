public class Parent {
    int outer;

    public class Child{
        int inner;

        public void setInner(int inner){
            this.inner = inner;
        }

        public int getInner(){
            return this.inner;
        }
    }
}