import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class gtb
  extends mfi
  implements oyw<gtc>
{
  private gtc a;
  private gtk b;
  
  private final gtc v()
  {
    if (this.a == null) {
      throw new IllegalStateException("peer() called before initialized");
    }
    return (gtc)this.a;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    
    for (;;)
    {
      try
      {
        super.a(paramLayoutInflater, paramViewGroup, paramBundle);
        gtc localgtc = v();
        View localView1 = paramLayoutInflater.inflate(efj.EN, paramViewGroup, false);
        ViewGroup localViewGroup = (ViewGroup)localView1.findViewById(efj.EM);
        qsl localqsl = localgtc.e.s();
        int i;
        if (localqsl.b)
        {
          View localView4 = localgtc.a(paramLayoutInflater, localViewGroup);
          localViewGroup.addView(localView4);
          if ((0x1 & localqsl.a) == 1)
          {
            m = 1;
            if (m == 0) {
              continue;
            }
            str3 = localgtc.b.b(localqsl.o());
            ((TextView)localView4.findViewById(16908308)).setText(str3);
            ((ImageView)localView4.findViewById(16908294)).setImageResource(aau.yb);
            localView4.setOnClickListener(new pdf(localgtc.c, "ActivityLog clicked delete", new gtd(localgtc)));
          }
        }
        else
        {
          if (localgtc.e.t())
          {
            View localView3 = localgtc.a(paramLayoutInflater, localViewGroup);
            localViewGroup.addView(localView3);
            if ((0x1 & localgtc.e.u().a) != 1) {
              break label590;
            }
            j = 1;
            if ((j == 0) || (localgtc.e.u().b().b() != raw.b)) {
              continue;
            }
            localObject2 = localgtc.b.b(localgtc.e.u().c());
            ((TextView)localView3.findViewById(16908308)).setText((CharSequence)localObject2);
            ((ImageView)localView3.findViewById(16908294)).setImageResource(aau.ya);
            localView3.setOnClickListener(new pdf(localgtc.c, "ActivityLog clicked Navigate", new gte(localgtc)));
          }
          if ((localgtc.e.v()) && (localgtc.e.q()))
          {
            if ((0x2 & localgtc.e.w().a) != 2) {
              continue;
            }
            i = 1;
            if (i != 0)
            {
              View localView2 = localgtc.a(paramLayoutInflater, localViewGroup);
              localViewGroup.addView(localView2);
              String str1 = localgtc.b.b(localgtc.e.r().b());
              ((TextView)localView2.findViewById(16908308)).setText(str1);
              ((ImageView)localView2.findViewById(16908294)).setImageResource(aau.yc);
              localView2.setOnClickListener(new pdf(localgtc.c, "ActivityLog clicked ACL_VIEW view", new gtf(localgtc)));
            }
          }
          localView1.setOnClickListener(new gtg(localgtc));
          return localView1;
        }
        int m = 0;
        continue;
        String str3 = localgtc.b.b(localqsl.q());
        continue;
        int k;
        if ((0x4 & localgtc.e.u().a) == 4)
        {
          k = 1;
          if (k != 0)
          {
            String str2 = localgtc.b.b(localgtc.e.u().d());
            localObject2 = str2;
          }
        }
        else
        {
          k = 0;
          continue;
          i = 0;
          continue;
        }
        Object localObject2 = "";
      }
      finally
      {
        pea.b();
      }
      continue;
      label590:
      int j = 0;
    }
  }
  
  /* Error */
  public final void a(android.app.Activity paramActivity)
  {
    // Byte code:
    //   0: invokestatic 34	pea:a	()V
    //   3: aload_0
    //   4: aload_1
    //   5: invokespecial 215	mfi:a	(Landroid/app/Activity;)V
    //   8: aload_0
    //   9: getfield 20	gtb:a	Lgtc;
    //   12: astore_3
    //   13: aload_3
    //   14: ifnonnull +48 -> 62
    //   17: aload_0
    //   18: aload_1
    //   19: checkcast 217	oyv
    //   22: invokeinterface 220 1 0
    //   27: checkcast 222	oze
    //   30: new 224	ozo
    //   33: dup
    //   34: aload_0
    //   35: invokespecial 227	ozo:<init>	(Lbk;)V
    //   38: invokeinterface 230 2 0
    //   43: checkcast 232	gtk
    //   46: putfield 234	gtb:b	Lgtk;
    //   49: aload_0
    //   50: aload_0
    //   51: getfield 234	gtb:b	Lgtk;
    //   54: invokeinterface 237 1 0
    //   59: putfield 20	gtb:a	Lgtc;
    //   62: invokestatic 203	pea:b	()V
    //   65: return
    //   66: astore 4
    //   68: new 22	java/lang/IllegalStateException
    //   71: dup
    //   72: ldc 239
    //   74: aload 4
    //   76: invokespecial 242	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   79: athrow
    //   80: astore_2
    //   81: invokestatic 203	pea:b	()V
    //   84: aload_2
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	gtb
    //   0	86	1	paramActivity	android.app.Activity
    //   80	5	2	localObject	Object
    //   12	2	3	localgtc	gtc
    //   66	9	4	localClassCastException	java.lang.ClassCastException
    // Exception table:
    //   from	to	target	type
    //   17	49	66	java/lang/ClassCastException
    //   3	13	80	finally
    //   17	49	80	finally
    //   49	62	80	finally
    //   68	80	80	finally
  }
  
  public final void a(Bundle paramBundle)
  {
    
    try
    {
      super.a(paramBundle);
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final LayoutInflater a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    return new ozd(f().getLayoutInflater().getContext(), this.b).b();
  }
  
  public final Class<gtc> au_()
  {
    return gtc.class;
  }
  
  public final void d(Bundle paramBundle)
  {
    
    try
    {
      super.d(paramBundle);
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void d_()
  {
    
    try
    {
      super.d_();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void f_()
  {
    
    try
    {
      super.f_();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void m()
  {
    
    try
    {
      super.m();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void n()
  {
    
    try
    {
      super.n();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void o()
  {
    
    try
    {
      super.o();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void p_()
  {
    
    try
    {
      super.p_();
      ((ViewGroup)v().a.findViewById(efj.EM)).requestFocus();
      return;
    }
    finally
    {
      pea.b();
    }
  }
  
  public final void q_()
  {
    
    try
    {
      super.q_();
      return;
    }
    finally
    {
      pea.b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gtb
 * JD-Core Version:    0.7.0.1
 */