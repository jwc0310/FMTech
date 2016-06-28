import android.content.Context;
import android.content.Intent;

public final class jqa
{
  public String a;
  public String b;
  public Integer c;
  public Integer d;
  public Integer e;
  public isq f;
  public Boolean g;
  public Boolean h;
  public Boolean i;
  public String j;
  public Boolean k;
  public Boolean l;
  public Integer m;
  public Integer n;
  public String o;
  public Boolean p;
  public String q;
  public Integer r;
  public Integer s;
  public Integer t;
  private final Intent u;
  private final int v;
  
  public jqa(Context paramContext, Class<?> paramClass, int paramInt)
  {
    this.u = new Intent(paramContext, paramClass);
    this.v = paramInt;
  }
  
  public final Intent a()
  {
    this.u.setAction("android.intent.action.VIEW");
    this.u.putExtra("account_id", this.v);
    if (this.a != null) {
      this.u.putExtra("cluster_id", this.a);
    }
    if (this.b != null) {
      this.u.putExtra("activity_id", this.b);
    }
    if (this.c != null) {
      this.u.putExtra("photo_picker_mode", this.c);
    }
    if (this.d != null) {
      this.u.putExtra("photo_picker_type", this.d);
    }
    if (this.f != null) {
      this.u.putExtra("photo_picker_selected", this.f);
    }
    if (this.e != null) {
      this.u.putExtra("photo_picker_crop_mode", this.e);
    }
    if (this.g != null) {
      this.u.putExtra("external", this.g);
    }
    if (this.h != null) {
      this.u.putExtra("is_for_get_content", this.h);
    }
    if (this.i != null) {
      this.u.putExtra("is_for_movie_maker_launch", this.i);
    }
    if (this.j != null) {
      this.u.putExtra("movie_maker_session_id", this.j);
    }
    if (this.k != null) {
      this.u.putExtra("hide_header", this.k);
    }
    if (this.m != null) {
      this.u.putExtra("photo_min_width", this.m);
    }
    if (this.n != null) {
      this.u.putExtra("photo_min_height", this.n);
    }
    if (this.o != null) {
      this.u.putExtra("auth_key", this.o);
    }
    if (this.p != null) {
      this.u.putExtra("show_autobackup_status", this.p);
    }
    if (this.l != null) {
      this.u.putExtra("share_only", this.l);
    }
    if (this.q != null) {
      this.u.putExtra("button_title_res_id", this.q);
    }
    if (this.r != null) {
      this.u.putExtra("min_selection_count", this.r);
    }
    if (this.s != null) {
      this.u.putExtra("max_selection_count", this.s);
    }
    if (this.t != null) {
      this.u.putExtra("filter", this.t);
    }
    return this.u;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jqa
 * JD-Core Version:    0.7.0.1
 */