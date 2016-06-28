import android.view.View;
import android.view.View.OnClickListener;

final class cqo
  implements View.OnClickListener
{
  cqo(cqm paramcqm, View paramView1, View paramView2) {}
  
  public final void onClick(View paramView)
  {
    int i = 8;
    cqm localcqm1 = this.c;
    boolean bool1;
    boolean bool2;
    label56:
    int j;
    if (!this.c.e)
    {
      bool1 = true;
      localcqm1.e = bool1;
      cqm localcqm2 = this.c;
      if ((!this.c.f) && (!this.c.e)) {
        break label197;
      }
      bool2 = true;
      localcqm2.f = bool2;
      View localView1 = this.a;
      if (!this.c.e) {
        break label203;
      }
      j = 0;
      label82:
      localView1.setVisibility(j);
      View localView2 = this.b;
      if (!this.c.e) {
        break label209;
      }
      label105:
      localView2.setVisibility(i);
      if (this.c.e)
      {
        if (this.c.a != 2) {
          break label214;
        }
        this.c.b.a(2, 2, cqm.a(this.c));
      }
    }
    for (;;)
    {
      this.c.i = true;
      this.c.e();
      cqm.a(this.c, this.c.a, 2, this.c.e);
      return;
      bool1 = false;
      break;
      label197:
      bool2 = false;
      break label56;
      label203:
      j = i;
      break label82;
      label209:
      i = 0;
      break label105;
      label214:
      this.c.b.a(1, 2, cqm.a(this.c));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqo
 * JD-Core Version:    0.7.0.1
 */