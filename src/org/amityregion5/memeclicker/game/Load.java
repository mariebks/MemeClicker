package org.amityregion5.memeclicker.game;

public class Load {

	private long memes;
	private long memesperclick;
	private long memespersec;
	private long[][] upgrades;
	private long [][] prices;
	private long [][] amount = new long[2][9]; {
		amount[0][0] = 1;
		amount[0][1] = 3;
		amount[0][2] = 10;
		amount[0][3] = 25;
		amount[0][4] = 100;
		amount[0][5] = 1000;
		amount[0][6] = 10000;
		amount[0][7] = 100000;
		amount[0][8] = 100000000;
		amount[1][0] = 5;
		amount[1][1] = 100;
		amount[1][2] = 500;
		amount[1][3] = 5000;
		amount[1][4] = 10000;
		amount[1][5] = 50000;
		amount[1][6] = 1000000;
		amount[1][7] = 5000000;
		amount[1][8] = 50000000;
		prices = new long[2][9];
		prices[0][0] = 200;
		prices[0][1] = 2500;
		prices[0][2] = 12500;
		prices[0][3] = 25000;
		prices[0][4] = 250000;
		prices[0][5]=  1250000;
		prices[0][6] = 25000000;
		prices[0][7] = 125000000;
		prices[0][8] = 1000000000;
		prices[1][0] = 200;
		prices[1][1] = 25000;
		prices[1][2] = 125000;
		prices[1][3] = 250000;
		prices[1][4] = 2500000;
		prices[1][5]=  12500000;
		prices[1][6] = 250000000;
		prices[1][7] = 750000000;
		prices[1][8] = 1000000000;
	}
	public Load()
	{
		memes=0;
		upgrades = new long[2][9];
		setMemespersec(0);
		setMemesperclick(1);
		for(int x=0;x<9;x++)
		{
			for(int y=0;y<9;y++)
			{
				upgrades[x][y]=0;
			}
		}
		
	}

	public Load(long a, long d, long e, long f, long g, long h, long i, long j, long k, long l, long m, long n, long o ,long p,long q, long r, long s, long t, long u)
	{
		memes=a;
		upgrades = new long[2][9];
		upgrades[0][0]=d;
		upgrades[0][1]=e;
		upgrades[0][2]=f;
		upgrades[0][3]=g;
		upgrades[0][4]=h;
		upgrades[0][5]=i;
		upgrades[0][6]=j;
		upgrades[0][7]=k;
		upgrades[0][8]=l;
		upgrades[1][0]=m;
		upgrades[1][1]=n;
		upgrades[1][2]=o;
		upgrades[1][3]=p;
		upgrades[1][4]=q;
		upgrades[1][5]=r;
		upgrades[1][6]=s;
		upgrades[1][7]=t;
		upgrades[1][8]=u;
		for(int x=0;x<9;x++)
		{
			setMemespersec(getMemespersec() + amount[0][x]*upgrades[0][x]);
			setMemesperclick(getMemesperclick() + amount[1][x]*upgrades[1][x]);
			setMemesperclick(getMemesperclick() + 1);
		}
		prices[0][0] += (long) (20*(Math.pow(1.1, d)-1));
		prices[0][1] += (long) (2500*(Math.pow(1.1, e)-1));
		prices[0][2] += (long) (12500*(Math.pow(1.1, f)-1));
		prices[0][3] += (long) (25000*(Math.pow(1.1, g)-1));
		prices[0][4] += (long) (250000*(Math.pow(1.1, h)-1));
		prices[0][5] += (long) (1250000*(Math.pow(1.1, i)-1));
		prices[0][6] += (long) (25000000*(Math.pow(1.1, j)-1));
		prices[0][7] += (long) (125000000*(Math.pow(1.1, k)-1));
		prices[0][8] += (long) (1000000000*(Math.pow(1.1, l)-1));
		prices[1][0] += (long) (200*(Math.pow(1.1, m)-1));
		prices[1][1] += (long) (25000*(Math.pow(1.1, n)-1));
		prices[1][2] += (long) (125000*(Math.pow(1.1, o)-1));
		prices[1][3] += (long) (250000*(Math.pow(1.1, p)-1));
		prices[1][4] += (long) (2500000*(Math.pow(1.1, q)-1));
		prices[1][5] += (long) (12500000*(Math.pow(1.1, r)-1));
		prices[1][6] += (long) (250000000*(Math.pow(1.1, s)-1));
		prices[1][7] += (long) (750000000*(Math.pow(1.1, t)-1));
		prices[1][8] += (long) (1000000000*(Math.pow(1.1, u)-1));

	}
	
	public void addpassive(int x)
	{
		if(this.memes<this.prices[0][x])
		{
			return;
		}
		this.upgrades[0][x]++;
		this.memes-=this.prices[0][x]++;
		this.prices[0][x]*=1.1;
		this.setMemespersec(this.getMemespersec() + this.amount[0][x]);
				
	}
	
	public void addclicker(int x)
	{
		if(this.memes<this.prices[1][x])
		{
			return;
		}
		this.upgrades[1][x]++;
		this.memes-=this.prices[1][x]++;
		this.prices[1][x]*=1.1;
		this.setMemesperclick(this.getMemesperclick() + this.amount[1][x]);
	}
	
	public void secondpass()
	{
		for(int x=0;x<9;x++)
		{
			memes+=amount[0][x]*upgrades[0][x];
		}
	}
	public void click()
	{
		for(int x=0;x<9;x++)
		{
			memes+=amount[1][x]*upgrades[1][x];
		}
	}

	public long getMemespersec() {
		return memespersec;
	}

	public void setMemespersec(long memespersec) {
		this.memespersec = memespersec;
	}

	public long getMemesperclick() {
		return memesperclick;
	}

	public void setMemesperclick(long memesperclick) {
		this.memesperclick = memesperclick;
	}
	

}

