import android.content.Context;
import android.content.Intent;

public final class dbt
{
  public Integer a;
  public Integer b;
  Boolean c;
  public Boolean d;
  public Integer e;
  Integer f;
  Integer g;
  Integer h;
  public Boolean i;
  public String j;
  public Integer k;
  public Integer l;
  Boolean m;
  private final Intent n;
  private final int o;
  
  public dbt(Context paramContext, Class<?> paramClass, int paramInt)
  {
    this.n = new Intent(paramContext, paramClass);
    this.o = paramInt;
  }
  
  public final Intent a()
  {
    this.n.setAction("android.intent.action.VIEW");
    this.n.putExtra("account_id", this.o);
    this.n.putExtra("disable_account_spinner", this.m);
    if (this.a != null) {
      this.n.putExtra("photo_picker_mode", this.a);
    }
    if (this.b != null) {
      this.n.putExtra("filter", this.b);
    }
    if (this.c != null) {
      this.n.putExtra("is_for_get_content", this.c);
    }
    if (this.d != null) {
      this.n.putExtra("force_return_edit_list", this.d);
    }
    if (this.e != null) {
      this.n.putExtra("tabs", this.e);
    }
    if (this.f != null) {
      this.n.putExtra("photo_picker_crop_mode", this.f);
    }
    if (this.g != null) {
      this.n.putExtra("photo_min_width", this.g);
    }
    if (this.h != null) {
      this.n.putExtra("photo_min_height", this.h);
    }
    if (this.i != null) {
      this.n.putExtra("disable_up_button", this.i);
    }
    if (this.j != null) {
      this.n.putExtra("button_title_res_id", this.j);
    }
    if (this.k != null) {
      this.n.putExtra("min_selection_count", this.k);
    }
    if (this.l != null) {
      this.n.putExtra("max_selection_count", this.l);
    }
    return this.n;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbt
 * JD-Core Version:    0.7.0.1
 */