import android.content.Context;
import android.content.Intent;
import com.google.android.apps.plus.phone.HostStreamPhotoPagerActivity;

public final class bdo
{
  public final Intent a;
  public String b;
  public ipf c;
  public String d;
  public String e;
  public Long f;
  public isq g;
  public Boolean h;
  public Boolean i;
  public String j;
  public Boolean k;
  public Boolean l;
  public Boolean m;
  public Boolean n;
  public String o;
  public Integer p;
  public Integer q;
  public Boolean r;
  public Integer s;
  public Boolean t;
  public String[] u;
  public Boolean v;
  public boolean w;
  private final int x;
  
  public bdo(Context paramContext, int paramInt)
  {
    this.a = new Intent(paramContext, HostStreamPhotoPagerActivity.class);
    this.x = paramInt;
  }
  
  public final Intent a()
  {
    this.a.setAction("android.intent.action.VIEW");
    this.a.putExtra("account_id", this.x);
    if (this.s != null) {
      this.a.putExtra("all_photos_offset", this.s);
    }
    if (this.b != null) {
      this.a.putExtra("tile_id", this.b);
    }
    if (this.d != null) {
      this.a.putExtra("photo_id", this.d);
    }
    if (this.e != null) {
      this.a.putExtra("view_id", this.e);
    }
    if (this.w)
    {
      this.a.putExtra("photo_picker_selected", this.g);
      this.a.putExtra("photo_picker_mode", 3);
    }
    if (this.h != null) {
      this.a.putExtra("is_for_get_content", this.h);
    }
    if (this.i != null) {
      this.a.putExtra("is_for_movie_maker_launch", this.i);
    }
    if (this.j != null) {
      this.a.putExtra("movie_maker_session_id", this.j);
    }
    if (this.k != null) {
      this.a.putExtra("refresh_collection", this.k);
    }
    if (this.l != null)
    {
      this.a.putExtra("selected_only", this.l);
      if ((this.l.booleanValue()) && (this.g == null)) {
        throw new IllegalArgumentException("Must have a selection to restrict to.");
      }
    }
    if (this.c != null) {
      this.a.putExtra("photo_ref", this.c);
    }
    if (this.m != null) {
      this.a.putExtra("force_return_edit_list", this.m);
    }
    if (this.v != null) {
      this.a.putExtra("show_oob_tile", this.v);
    }
    if (this.n != null) {
      this.a.putExtra("disable_photo_comments", this.n);
    }
    if (this.o != null) {
      this.a.putExtra("auth_key", this.o);
    }
    if (this.p != null) {
      this.a.putExtra("picker_mode", this.p);
    }
    if (this.q != null) {
      this.a.putExtra("filter", this.q);
    }
    if (this.r != null) {
      this.a.putExtra("disable_chromecast", this.r);
    }
    if (this.f != null) {
      this.a.putExtra("all_photos_row_id", this.f);
    }
    if (this.t != null) {
      this.a.putExtra("up_as_back", this.t);
    }
    if (this.u != null) {
      this.a.putExtra("photos_id_array", this.u);
    }
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bdo
 * JD-Core Version:    0.7.0.1
 */