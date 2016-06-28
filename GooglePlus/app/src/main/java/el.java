import android.app.Notification;

final class el
  implements ep
{
  private String a;
  private int b;
  private String c;
  private Notification d;
  
  public el(String paramString1, int paramInt, String paramString2, Notification paramNotification)
  {
    this.a = paramString1;
    this.b = paramInt;
    this.c = paramString2;
    this.d = paramNotification;
  }
  
  public final void a(cs paramcs)
  {
    paramcs.a(this.a, this.b, this.c, this.d);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("NotifyTask[");
    localStringBuilder.append("packageName:").append(this.a);
    localStringBuilder.append(", id:").append(this.b);
    localStringBuilder.append(", tag:").append(this.c);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     el
 * JD-Core Version:    0.7.0.1
 */