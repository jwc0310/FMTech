import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class kfg
  extends ket
{
  public List<ket> a = new ArrayList();
  private boolean b = true;
  private int c = 0;
  private boolean d = false;
  
  public kfg(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, kfu.s, paramInt, 0);
    this.b = localTypedArray.getBoolean(kfu.t, this.b);
    localTypedArray.recycle();
  }
  
  public boolean a(ket paramket)
  {
    paramket.e(e());
    return true;
  }
  
  protected final void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    int i = this.a.size();
    for (int j = 0; j < i; j++) {
      ((ket)this.a.get(j)).b(paramBundle);
    }
  }
  
  public final boolean b(ket paramket)
  {
    if (this.a.contains(paramket)) {
      return true;
    }
    if (paramket.q == 2147483647)
    {
      if (this.b)
      {
        int j = this.c;
        this.c = (j + 1);
        if (j != paramket.q)
        {
          paramket.q = j;
          paramket.h();
        }
      }
      if ((paramket instanceof kfg)) {
        ((kfg)paramket).b = this.b;
      }
    }
    int i = Collections.binarySearch(this.a, paramket);
    if (i < 0) {
      i = -1 + -i;
    }
    if (!a(paramket)) {
      return false;
    }
    try
    {
      this.a.add(i, paramket);
      paramket.a(this.m);
      if (this.d) {
        paramket.i();
      }
      h();
      return true;
    }
    finally {}
  }
  
  public final ket c(CharSequence paramCharSequence)
  {
    if (TextUtils.equals(this.s, paramCharSequence)) {
      return this;
    }
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      ket localket1 = (ket)this.a.get(j);
      String str = localket1.s;
      if ((str != null) && (str.equals(paramCharSequence))) {
        return localket1;
      }
      if ((localket1 instanceof kfg))
      {
        ket localket2 = ((kfg)localket1).c(paramCharSequence);
        if (localket2 != null) {
          return localket2;
        }
      }
    }
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    int i = this.a.size();
    for (int j = 0; j < i; j++) {
      ((ket)this.a.get(j)).c(paramBundle);
    }
  }
  
  public final boolean c(ket paramket)
  {
    try
    {
      paramket.j();
      boolean bool = this.a.remove(paramket);
      return bool;
    }
    finally {}
  }
  
  public final void d()
  {
    try
    {
      List localList = this.a;
      for (int i = -1 + localList.size(); i >= 0; i--) {
        c((ket)localList.get(0));
      }
      h();
      return;
    }
    finally {}
  }
  
  public final void d(boolean paramBoolean)
  {
    super.d(paramBoolean);
    int i = this.a.size();
    for (int j = 0; j < i; j++) {
      ((ket)this.a.get(j)).e(paramBoolean);
    }
  }
  
  public final void i()
  {
    super.i();
    this.d = true;
    int i = this.a.size();
    for (int j = 0; j < i; j++) {
      ((ket)this.a.get(j)).i();
    }
  }
  
  protected final void j()
  {
    super.j();
    this.d = false;
  }
  
  public boolean k()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kfg
 * JD-Core Version:    0.7.0.1
 */