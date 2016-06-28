import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import com.google.android.libraries.social.acl2.AclPickerActionBarView;
import java.util.Collection;

public class goa
  implements hru, mbo, mdp, mfa, mfd
{
  public AclPickerActionBarView a;
  boolean b = true;
  public boolean c;
  private tt d;
  private hrs e;
  
  public goa(tt paramtt, mek parammek)
  {
    this.d = paramtt;
    parammek.a(this);
  }
  
  private final boolean a()
  {
    return (this.c) || (!this.e.b());
  }
  
  public final void a(int paramInt, Parcelable paramParcelable)
  {
    boolean bool = a();
    if (this.a != null) {
      this.a.a(bool);
    }
  }
  
  public final void a(Integer paramInteger, Collection<Parcelable> paramCollection)
  {
    boolean bool = a();
    if (this.a != null) {
      this.a.a(bool);
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.e = ((hrs)parammbb.b(hrs.class));
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putBoolean("AclPickerActionBarHandler.search_mode_enabled", this.a.b);
    Editable localEditable = this.a.a.a.getText();
    if (!TextUtils.isEmpty(localEditable)) {
      paramBundle.putCharSequence("AclPickerActionBarHandler.search_mode_query", localEditable);
    }
  }
  
  public final void b_(Bundle paramBundle)
  {
    tp localtp = this.d.e().a();
    localtp.a(null);
    localtp.b(false);
    this.a = ((AclPickerActionBarView)LayoutInflater.from(this.d).inflate(efj.El, null));
    tq localtq = new tq(-1, -1);
    localtp.a(this.a, localtq);
    localtp.e(true);
    if ((paramBundle != null) && (paramBundle.getBoolean("AclPickerActionBarHandler.search_mode_enabled")))
    {
      CharSequence localCharSequence = paramBundle.getCharSequence("AclPickerActionBarHandler.search_mode_query");
      this.a.a(localCharSequence);
    }
    if ((this.e instanceof hrw))
    {
      boolean bool = a();
      if (this.a != null) {
        this.a.a(bool);
      }
      ((hrw)this.e).a(this);
    }
    this.a.a(this.b, false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     goa
 * JD-Core Version:    0.7.0.1
 */