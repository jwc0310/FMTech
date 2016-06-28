import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class br
  extends bv<bp>
{
  public br(bp parambp)
  {
    super(parambp);
  }
  
  public final View a(int paramInt)
  {
    return this.i.findViewById(paramInt);
  }
  
  public final void a(bk parambk)
  {
    this.i.a(parambk);
  }
  
  public final void a(bk parambk, Intent paramIntent, int paramInt)
  {
    this.i.a(parambk, paramIntent, paramInt);
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.i.dump(paramString, null, paramPrintWriter, paramArrayOfString);
  }
  
  public final boolean a()
  {
    Window localWindow = this.i.getWindow();
    return (localWindow != null) && (localWindow.peekDecorView() != null);
  }
  
  public final boolean b()
  {
    return !this.i.isFinishing();
  }
  
  public final LayoutInflater c()
  {
    return this.i.getLayoutInflater().cloneInContext(this.i);
  }
  
  public final void d()
  {
    this.i.aq_();
  }
  
  public final boolean e()
  {
    return this.i.getWindow() != null;
  }
  
  public final int f()
  {
    Window localWindow = this.i.getWindow();
    if (localWindow == null) {
      return 0;
    }
    return localWindow.getAttributes().windowAnimations;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     br
 * JD-Core Version:    0.7.0.1
 */