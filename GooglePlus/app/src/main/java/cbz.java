import com.google.android.apps.plus.phone.EventActivity;

final class cbz
  implements Runnable
{
  cbz(cbs paramcbs, int paramInt) {}
  
  public final void run()
  {
    if (this.b.s)
    {
      bp localbp = this.b.f();
      if ((localbp instanceof EventActivity))
      {
        EventActivity localEventActivity = (EventActivity)localbp;
        if (this.a == localEventActivity.d) {
          localEventActivity.d = 0;
        }
        this.b.x();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cbz
 * JD-Core Version:    0.7.0.1
 */