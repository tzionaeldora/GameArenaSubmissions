public class Sample 
{
    public static void main(String[] args)
        {
            GameArena arena = new GameArena(1000, 1000);

            Ball b = new Ball(150, 150, 100, "WHITE");
            Ball c = new Ball(100, 100, 50, "WHITE");
            Ball d = new Ball(200, 100, 50, "WHITE");
            arena.addBall(c);
            arena.addBall(d);
            arena.addBall(b);

            Ball e = new Ball(850, 850, 100, "WHITE");
            Ball f = new Ball(800, 800, 50, "PINK");
            Ball g = new Ball(900, 800, 50, "PINK");
            arena.addBall(f);
            arena.addBall(g);
            arena.addBall(e);

            Line h = new Line(220, 150, 300, 150, 5, "RED");
            Line i = new Line(300, 150, 300, 300, 5, "RED");
            Line j = new Line(300, 300, 500, 300, 5, "RED");
            Line k = new Line(500, 300, 500, 400, 5, "RED");
            Line l = new Line(500, 400, 200, 400, 5, "RED");
            Line m = new Line(200, 400, 200, 500, 5, "RED");
            Line n = new Line(200, 500, 700, 500, 5, "RED");
            Line o = new Line(700, 500, 700, 300, 5, "RED");
            Line p = new Line(700, 300, 800, 300, 5, "RED");
            Line q = new Line(800, 300, 800, 600, 5, "RED");
            Line r = new Line(800, 600, 400, 600, 5, "RED");
            Line s = new Line(400, 600, 400, 700, 5, "RED");
            Line t = new Line(400, 700, 100, 700, 5, "RED");
            Line u = new Line(100, 700, 100, 800, 5, "RED");
            Line v = new Line(100, 800, 500, 800, 5, "RED");
            Line w = new Line(500, 800, 500, 700, 5, "RED");
            Line x = new Line(500, 700, 600, 700, 5, "RED");
            Line y = new Line(600, 700, 600, 850, 5, "RED");
            Line z = new Line(600, 850, 780, 850, 5, "RED");
            arena.addLine(h);
            arena.addLine(i);
            arena.addLine(j);
            arena.addLine(k);
            arena.addLine(l);
            arena.addLine(m);
            arena.addLine(n);
            arena.addLine(o);
            arena.addLine(p);
            arena.addLine(q);
            arena.addLine(r);
            arena.addLine(s);
            arena.addLine(t);
            arena.addLine(u);
            arena.addLine(v);
            arena.addLine(w);
            arena.addLine(x);
            arena.addLine(y);
            arena.addLine(z);

            while(true)
            {
                arena.pause();
            }
        }
}

