import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;

public final class bxa
  extends cos
{
  private int a;
  private boolean b;
  
  public bxa(Context paramContext, int paramInt, cow paramcow)
  {
    super(paramContext, paramInt, paramcow);
  }
  
  /* Error */
  private final boolean k()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 18	bxa:g	Landroid/content/Context;
    //   4: invokevirtual 24	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   7: aload_0
    //   8: getfield 18	bxa:g	Landroid/content/Context;
    //   11: invokestatic 29	hbu:b	(Landroid/content/Context;)Landroid/net/Uri;
    //   14: iconst_1
    //   15: anewarray 31	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: ldc 33
    //   22: aastore
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: invokevirtual 39	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   29: astore_3
    //   30: aload_3
    //   31: astore_2
    //   32: aload_2
    //   33: ifnull +42 -> 75
    //   36: aload_2
    //   37: invokeinterface 44 1 0
    //   42: ifeq +33 -> 75
    //   45: aload_2
    //   46: iconst_0
    //   47: invokeinterface 48 2 0
    //   52: istore 5
    //   54: iload 5
    //   56: ifne +19 -> 75
    //   59: iconst_1
    //   60: istore 4
    //   62: aload_2
    //   63: ifnull +9 -> 72
    //   66: aload_2
    //   67: invokeinterface 52 1 0
    //   72: iload 4
    //   74: ireturn
    //   75: iconst_0
    //   76: istore 4
    //   78: goto -16 -> 62
    //   81: astore_1
    //   82: aconst_null
    //   83: astore_2
    //   84: aload_2
    //   85: ifnull +9 -> 94
    //   88: aload_2
    //   89: invokeinterface 52 1 0
    //   94: aload_1
    //   95: athrow
    //   96: astore_1
    //   97: goto -13 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	bxa
    //   81	14	1	localObject1	Object
    //   96	1	1	localObject2	Object
    //   31	58	2	localCursor1	android.database.Cursor
    //   29	2	3	localCursor2	android.database.Cursor
    //   60	17	4	bool	boolean
    //   52	3	5	i	int
    // Exception table:
    //   from	to	target	type
    //   0	30	81	finally
    //   36	54	96	finally
  }
  
  public final void a()
  {
    new bxc(this, this.g, this.f).execute(new Void[] { null });
    f();
  }
  
  protected final void a(View paramView)
  {
    if (paramView.getResources() == null) {
      throw new NullPointerException();
    }
    a(paramView, this.g.getString(aau.rF));
    b(paramView, this.g.getString(aau.rI));
    Resources localResources1 = paramView.getResources();
    int i = efj.xX;
    int j = this.a;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.a);
    String str = localResources1.getQuantityString(i, j, arrayOfObject);
    ((TextView)paramView.findViewById(aaw.fn)).setText(str);
    paramView.findViewById(aaw.bc).setOnClickListener(new bxb(this));
    TextView localTextView = (TextView)paramView.findViewById(aaw.az);
    Resources localResources2 = paramView.getResources();
    if (this.b) {}
    for (int k = aau.rH;; k = aau.rG)
    {
      localTextView.setText(localResources2.getString(k));
      return;
    }
  }
  
  public final boolean a(ojj paramojj)
  {
    if (!super.a(paramojj)) {
      return false;
    }
    hba localhba = (hba)mbb.a(this.g, hba.class);
    if ((this.f == -1) || (!localhba.c(this.f).c("auto_backup_enabled")) || (hbj.a(this.g)) || (!hbj.d(this.g))) {
      return false;
    }
    if (bgp.a(this.g, this.f, coq.f).b > 0L) {
      return false;
    }
    long l = hbj.j(this.g, this.f);
    if ((l == 0L) || (l > 1400544000000L)) {
      return false;
    }
    if (hbj.h(this.g, this.f) > 0) {
      return false;
    }
    this.b = k();
    this.a = hbj.i(this.g, this.f);
    return this.a > 0;
  }
  
  public final void b()
  {
    f();
  }
  
  public final int d()
  {
    return efj.sQ;
  }
  
  public final coq e()
  {
    return coq.f;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxa
 * JD-Core Version:    0.7.0.1
 */