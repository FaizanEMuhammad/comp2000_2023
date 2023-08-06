public class Main {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
    }
    class Cells{
        int x;
        int y;
        public Cells(int x, int y){
            this.x = x;
            this.y = y;
        }

        public void paint(Graphics g){
            g.setColor(Color.WHITE);
            g.fillRect(x,y,35,35);
            g.setColor(Color.BLACK);
            g.drawRect(x,y,35,35);
        }

    }
    class Grid extends JPanel{
        private final Cells[][] cells = new Cells[20][20];

        public Grid(){
            setPreferredSize(new Dimension(720,720));
            for(int i=0; i<20;i++){
                for(int j=0; j<20;j++){
                    cells[i][j] = new Cells(10+(i*35),10+(j*35));
                }
            } 
            
            
        }
       
        
        @Override
        public void paint(Graphics g){
            for(int i=0; i<20;i++){
                for(int j=0; j<20;j++){
                    cells[i][j].paint(g);
                }
            }
        }
    }
    private Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Grid grid = new Grid();
        this.setContentPane(grid);
        this.pack();
        this.setVisible(true);
    }
}