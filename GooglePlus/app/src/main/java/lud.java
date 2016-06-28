import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public final class lud
{
  final luk a;
  public final View b;
  public boolean c;
  public ArrayList<lui> d = new ArrayList();
  private final Context e;
  private TextView f;
  private TextView g;
  private Button h;
  private Button i;
  
  public lud(lug paramlug)
  {
    this.a = paramlug.a;
    this.e = paramlug.b;
    LayoutInflater localLayoutInflater = (LayoutInflater)this.e.getSystemService("layout_inflater");
    if (paramlug.c != null) {}
    int k;
    for (int j = 1;; j = 0)
    {
      this.c = paramlug.d;
      k = paramlug.e.size();
      switch (k)
      {
      default: 
        throw new IllegalArgumentException();
      }
    }
    this.b = localLayoutInflater.inflate(efj.ZG, null);
    this.b.findViewById(efj.ZC).setVisibility(8);
    this.b.setOnClickListener(new lue(this, paramlug));
    if (this.h == null) {
      this.h = ((Button)this.b.findViewById(efj.ZA));
    }
    if (this.i == null) {
      this.i = ((Button)this.b.findViewById(efj.ZB));
    }
    this.f = ((TextView)this.b.findViewById(efj.ZD));
    this.g = ((TextView)this.b.findViewById(efj.ZE));
    switch (k)
    {
    default: 
      label268:
      if (paramlug.c == null) {
        this.f.setVisibility(8);
      }
      break;
    }
    for (;;)
    {
      this.g.setVisibility(8);
      return;
      this.b = localLayoutInflater.inflate(efj.ZF, null);
      if (j != 0) {}
      int m = efj.Zw;
      LinearLayout localLinearLayout = (LinearLayout)this.b.findViewById(efj.Zz);
      int n = this.b.getResources().getDimensionPixelSize(m);
      localLinearLayout.getLayoutParams().height = n;
      break;
      this.b = localLayoutInflater.inflate(efj.ZG, null);
      this.i = ((Button)this.b.findViewById(efj.ZB));
      break;
      this.h.setVisibility(8);
      this.i.setVisibility(8);
      break label268;
      this.i.setVisibility(8);
      a(this.h, (luj)paramlug.e.get(0));
      break label268;
      a(this.h, (luj)paramlug.e.get(0));
      a(this.i, (luj)paramlug.e.get(1));
      break label268;
      this.f.setText(paramlug.c);
    }
  }
  
  private final void a(Button paramButton, luj paramluj)
  {
    paramButton.setText(paramluj.a);
    if (paramluj.b != 0) {
      paramButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, paramluj.b, 0);
    }
    paramButton.setOnClickListener(new luf(this, paramluj));
  }
  
  public final String toString()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.f != null) {
      localArrayList.add(this.f.getText());
    }
    if (this.g != null) {
      localArrayList.add(this.g.getText());
    }
    if (this.h != null) {
      localArrayList.add(this.h.getText());
    }
    if (this.i != null) {
      localArrayList.add(this.i.getText());
    }
    return TextUtils.join("\n", localArrayList);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lud
 * JD-Core Version:    0.7.0.1
 */