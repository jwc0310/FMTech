import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.widget.Toast;
import java.util.List;

public final class lew
  extends mby
  implements DialogInterface.OnClickListener, gxs
{
  private git Z;
  private String aa;
  private String ab;
  private String ac;
  private int ag;
  private int ah;
  private SparseIntArray ai;
  
  public lew()
  {
    new gxj(this.af, (byte)0);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.aa = this.m.getString("square_id");
    this.ab = this.m.getString("qualified_id");
    this.ac = this.m.getString("user_name");
    this.ag = this.m.getInt("user_member_type");
    this.ah = this.m.getInt("viewer_member_type");
    SparseIntArray localSparseIntArray = new SparseIntArray();
    if (this.ah == 1) {}
    for (int i = 1; this.Z.f().b("gaia_id").equals(efj.t(this.ab)); i = 0)
    {
      if (i != 0) {
        localSparseIntArray.append(12, eu.z);
      }
      localSparseIntArray.append(14, eu.y);
      this.ai = localSparseIntArray;
      if (this.ai.size() == 0)
      {
        mbf localmbf1 = this.ad;
        mbf localmbf2 = this.ad;
        int n = eu.u;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.ac;
        Toast.makeText(localmbf1, localmbf2.getString(n, arrayOfObject), 1).show();
        a(false);
      }
      return;
    }
    int j;
    int k;
    switch (this.ag)
    {
    default: 
      j = 0;
      k = 0;
      label262:
      if (this.ag != 1) {
        break;
      }
    }
    for (int m = 1; (m == 0) || (i != 0); m = 0)
    {
      if (j != 0) {
        localSparseIntArray.append(6, eu.x);
      }
      if ((k != 0) || (efj.t(this.ab) == null)) {
        break;
      }
      localSparseIntArray.append(7, eu.i);
      break;
      localSparseIntArray.append(8, eu.A);
      k = 1;
      j = 0;
      break label262;
      localSparseIntArray.append(1, eu.h);
      localSparseIntArray.append(4, eu.m);
      j = 0;
      k = 0;
      break label262;
      localSparseIntArray.append(22, eu.j);
      j = 0;
      k = 0;
      break label262;
      if (i != 0)
      {
        localSparseIntArray.append(12, eu.l);
        localSparseIntArray.append(14, eu.k);
        j = 1;
        k = 0;
        break label262;
        if (i != 0)
        {
          localSparseIntArray.append(10, eu.w);
          localSparseIntArray.append(13, eu.k);
          j = 1;
          k = 0;
          break label262;
          if (i != 0) {
            localSparseIntArray.append(9, eu.v);
          }
        }
      }
      j = 1;
      k = 0;
      break label262;
    }
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    un localun = new un(this.ad);
    String str = this.ac;
    localun.a.e = str;
    localun.a.n = true;
    String[] arrayOfString = new String[this.ai.size()];
    for (int i = -1 + this.ai.size(); i >= 0; i--) {
      arrayOfString[i] = this.ad.getString(this.ai.valueAt(i));
    }
    localun.a(arrayOfString, this);
    return localun.a();
  }
  
  protected final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.Z = ((git)this.ae.a(git.class));
    this.ae.a(gxs.class, this);
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    gxt localgxt;
    if (paramInt >= 0)
    {
      int i = this.ai.keyAt(paramInt);
      ((lex)this.ae.a(lex.class)).a(this.aa, this.ab, i);
      switch (i)
      {
      case 2: 
      case 3: 
      case 5: 
      case 11: 
      case 15: 
      case 16: 
      case 17: 
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      default: 
        localgxt = null;
      }
    }
    for (;;)
    {
      if (localgxt != null)
      {
        mbf localmbf = this.ad;
        gxr localgxr = new gxr();
        gxq localgxq = new gxq(localgxt);
        localgxr.b.add(localgxq);
        new gwz(4, localgxr.a(this.ad)).b(localmbf);
      }
      paramDialogInterface.dismiss();
      return;
      localgxt = pjo.aG;
      continue;
      localgxt = pjo.aH;
      continue;
      localgxt = pjo.U;
      continue;
      localgxt = pjo.V;
      continue;
      localgxt = pjo.W;
      continue;
      localgxt = pjo.aK;
      continue;
      localgxt = pjo.h;
      continue;
      localgxt = pjo.aP;
      continue;
      localgxt = pjo.e;
      continue;
      localgxt = pjo.av;
      continue;
      localgxt = pjo.k;
    }
  }
  
  public final gxq v()
  {
    return new kuw(pjo.z, this.aa);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lew
 * JD-Core Version:    0.7.0.1
 */