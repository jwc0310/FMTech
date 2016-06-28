import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class jul
  extends mca
{
  private juz a;
  private TextView b;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Tn, paramViewGroup, false);
    this.b = ((TextView)localView.findViewById(ehr.du));
    efj.a(this.b, new gxq(pjz.c));
    this.b.setOnClickListener(new gxn(new jun(this)));
    v();
    return localView;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((jwa)((kij)this.bo.a(kij.class)).a(jwa.class)).a;
    this.a.a(new jum(this));
  }
  
  final void v()
  {
    TextView localTextView = this.b;
    if (this.a.n()) {}
    for (int i = 0;; i = 8)
    {
      localTextView.setVisibility(i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jul
 * JD-Core Version:    0.7.0.1
 */