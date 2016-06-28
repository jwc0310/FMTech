import android.content.res.Resources;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.social.people.ui.CircleWithAvatarsViewGroup;
import java.util.List;

final class cww
  extends aga<agt>
{
  List<Pair<jgw, List<jjg>>> c;
  private final LayoutInflater e;
  
  public cww(cwr paramcwr)
  {
    this.e = LayoutInflater.from(paramcwr.bn);
  }
  
  public final int a()
  {
    if ((this.c != null) && (this.c.size() > 0)) {
      return 1 + this.c.size();
    }
    return 0;
  }
  
  public final int a(int paramInt)
  {
    if (paramInt == -1 + a()) {
      return 1;
    }
    return 0;
  }
  
  public final agt a(ViewGroup paramViewGroup, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Invalid item type");
    case 0: 
      return new cwv(this.d.f(), this.e.inflate(aau.wQ, paramViewGroup, false));
    }
    Resources localResources = this.d.g();
    TextView localTextView = new TextView(this.d.bn);
    localTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    int i = localResources.getDimensionPixelSize(efj.AA);
    localTextView.setPadding(i, i, i, i);
    cwr localcwr = this.d;
    int j = eyg.d;
    localTextView.setText(localcwr.g().getString(j));
    localTextView.setGravity(8388629);
    localTextView.setAllCaps(true);
    localTextView.setTextAppearance(this.d.bn, aau.wR);
    localTextView.setTextColor(localResources.getColor(efj.Az));
    efj.a(localTextView, new gxq(pkf.o));
    localTextView.setOnClickListener(new gxn(new cwx(this)));
    return new cwy(this, localTextView);
  }
  
  public final void a(agt paramagt, int paramInt)
  {
    int i;
    View localView2;
    if (paramInt == -1 + a())
    {
      i = 1;
      if (i == 0)
      {
        cwv localcwv = (cwv)paramagt;
        localcwv.p.a((jgw)((Pair)this.c.get(paramInt)).first, (List)((Pair)this.c.get(paramInt)).second);
        View localView1 = localcwv.a;
        gxt localgxt = pkf.h;
        String[] arrayOfString = new String[1];
        arrayOfString[0] = localcwv.p.b;
        efj.a(localView1, new kut(localgxt, arrayOfString));
        localcwv.r = this.d.c.a(this.d.bn, this.d.a.c(), localcwv.p.b, localcwv.p.a);
        localView2 = localcwv.q;
        if (paramInt == 0) {
          break label194;
        }
      }
    }
    label194:
    for (int j = 0;; j = 8)
    {
      localView2.setVisibility(j);
      return;
      i = 0;
      break;
    }
  }
  
  public final void a(jjr paramjjr)
  {
    if (paramjjr != null) {}
    for (List localList = paramjjr.a();; localList = null)
    {
      this.c = localList;
      this.a.b();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cww
 * JD-Core Version:    0.7.0.1
 */