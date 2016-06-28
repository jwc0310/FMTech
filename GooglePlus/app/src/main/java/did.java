import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.widget.EditText;
import com.google.android.apps.plus.profile.impl.ProfileEditorHeaderView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class did
  extends aga<dif>
{
  Cursor c;
  Cursor d;
  String e;
  int f;
  int g;
  final Set<String> h;
  final Set<String> i;
  final quh j;
  final qtx k;
  final qub l;
  private Cursor m;
  private ProfileEditorHeaderView n;
  private final Context o;
  private final agi p;
  private final qtj q;
  private final qtl r;
  private final qtt s;
  private final qtg t;
  private final kxq u;
  private final leq v;
  private final lee w;
  
  did(Context paramContext)
  {
    this.o = paramContext;
    this.h = new HashSet();
    this.i = new HashSet();
    this.p = new agi(paramContext.getResources().getDimensionPixelSize(efj.Kg), -2);
    int i1 = paramContext.getResources().getDimensionPixelSize(efj.Kh);
    this.p.setMargins(i1, i1, i1, i1);
    this.q = new qtj();
    this.r = new qtl();
    this.s = new qtt();
    this.j = new quh();
    this.k = new qtx();
    this.l = new qub();
    this.t = new qtg();
    this.u = ((kxq)mbb.a(paramContext, kxq.class));
    this.v = ((leq)mbb.a(paramContext, leq.class));
    this.w = ((lee)mbb.b(paramContext, lee.class));
  }
  
  public final int a()
  {
    if (this.c == null) {
      return 2;
    }
    return 2 + this.c.getCount();
  }
  
  public final int a(int paramInt)
  {
    if (paramInt == -1 + dig.a) {
      return -1 + dig.a;
    }
    if (paramInt == -1 + dig.b) {
      return -1 + dig.b;
    }
    return -1 + dig.c;
  }
  
  public final void a(Cursor paramCursor)
  {
    if (this.m == paramCursor) {
      return;
    }
    this.m = paramCursor;
    c(-1 + dig.a);
  }
  
  public final void a(ArrayList<String> paramArrayList)
  {
    this.h.clear();
    if (paramArrayList == null) {
      return;
    }
    this.h.addAll(paramArrayList);
  }
  
  public final String b()
  {
    if (this.n != null) {
      return this.n.e.getText().toString();
    }
    return null;
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    this.f = paramInt1;
    this.g = paramInt2;
    c(-1 + dig.b);
  }
  
  public final void b(Cursor paramCursor)
  {
    if (this.c == paramCursor) {
      return;
    }
    this.c = paramCursor;
    this.a.b();
  }
  
  public final boolean c()
  {
    Boolean localBoolean = this.t.b;
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     did
 * JD-Core Version:    0.7.0.1
 */