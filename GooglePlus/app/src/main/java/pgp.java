import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pgp<V>
  implements pic<V>
{
  static final pgq a;
  private static final boolean b = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
  private static final Logger c = Logger.getLogger(pgp.class.getName());
  private static final Object d;
  volatile pgu listeners;
  volatile Object value;
  volatile phb waiters;
  
  static
  {
    try
    {
      localObject = new pgz();
      a = (pgq)localObject;
      d = new Object();
      return;
    }
    catch (Throwable localThrowable1)
    {
      for (;;)
      {
        try
        {
          localObject = new pgv(AtomicReferenceFieldUpdater.newUpdater(phb.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(phb.class, phb.class, "next"), AtomicReferenceFieldUpdater.newUpdater(pgp.class, phb.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(pgp.class, pgu.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(pgp.class, Object.class, "value"));
        }
        catch (Throwable localThrowable2)
        {
          c.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", localThrowable1);
          c.log(Level.SEVERE, "SafeAtomicHelper is broken!", localThrowable2);
          Object localObject = new pgx();
        }
      }
    }
  }
  
  private final void a(phb paramphb)
  {
    paramphb.thread = null;
    Object localObject1 = this.waiters;
    if (localObject1 == phb.a) {}
    label35:
    label84:
    for (;;)
    {
      return;
      for (;;)
      {
        if (localObject1 == null) {
          break label84;
        }
        phb localphb = ((phb)localObject1).next;
        Object localObject2;
        if (((phb)localObject1).thread != null)
        {
          localObject2 = localObject1;
          localObject1 = localphb;
        }
        else
        {
          if (localObject2 != null)
          {
            localObject2.next = localphb;
            if (localObject2.thread == null) {
              break;
            }
          }
          for (;;)
          {
            localObject1 = localObject2;
            break label35;
            if (!a.a(this, (phb)localObject1, localphb)) {
              break;
            }
          }
          localObject2 = null;
        }
      }
    }
  }
  
  private static V b(Object paramObject)
  {
    if ((paramObject instanceof pgr))
    {
      Throwable localThrowable = ((pgr)paramObject).b;
      CancellationException localCancellationException = new CancellationException("Task was cancelled.");
      localCancellationException.initCause(localThrowable);
      throw localCancellationException;
    }
    if ((paramObject instanceof pgs)) {
      throw new ExecutionException(((pgs)paramObject).b);
    }
    if (paramObject == d) {
      paramObject = null;
    }
    return paramObject;
  }
  
  private static void b(Runnable paramRunnable, Executor paramExecutor)
  {
    try
    {
      paramExecutor.execute(paramRunnable);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      Logger localLogger = c;
      Level localLevel = Level.SEVERE;
      String str1 = String.valueOf(paramRunnable);
      String str2 = String.valueOf(paramExecutor);
      localLogger.log(localLevel, 57 + String.valueOf(str1).length() + String.valueOf(str2).length() + "RuntimeException while executing runnable " + str1 + " with executor " + str2, localRuntimeException);
    }
  }
  
  private final void d()
  {
    phb localphb;
    do
    {
      localphb = this.waiters;
    } while (!a.a(this, localphb, phb.a));
    while (localphb != null)
    {
      Thread localThread = localphb.thread;
      if (localThread != null)
      {
        localphb.thread = null;
        LockSupport.unpark(localThread);
      }
      localphb = localphb.next;
    }
    Object localObject1;
    boolean bool;
    Object localObject2;
    do
    {
      localObject1 = this.listeners;
      bool = a.a(this, (pgu)localObject1, pgu.a);
      localObject2 = null;
    } while (!bool);
    while (localObject1 != null)
    {
      pgu localpgu = ((pgu)localObject1).next;
      ((pgu)localObject1).next = ((pgu)localObject2);
      localObject2 = localObject1;
      localObject1 = localpgu;
    }
    while (localObject2 != null)
    {
      b(((pgu)localObject2).b, ((pgu)localObject2).c);
      localObject2 = ((pgu)localObject2).next;
    }
    c();
  }
  
  protected void a() {}
  
  public void a(Runnable paramRunnable, Executor paramExecutor)
  {
    aau.b(paramRunnable, "Runnable was null.");
    aau.b(paramExecutor, "Executor was null.");
    pgu localpgu1 = this.listeners;
    if (localpgu1 != pgu.a)
    {
      pgu localpgu2 = new pgu(paramRunnable, paramExecutor);
      do
      {
        localpgu2.next = localpgu1;
        if (a.a(this, localpgu1, localpgu2)) {
          return;
        }
        localpgu1 = this.listeners;
      } while (localpgu1 != pgu.a);
    }
    b(paramRunnable, paramExecutor);
  }
  
  protected boolean a(V paramV)
  {
    if (paramV == null) {
      paramV = d;
    }
    if (a.a(this, null, paramV))
    {
      d();
      return true;
    }
    return false;
  }
  
  protected boolean a(Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      throw new NullPointerException();
    }
    pgs localpgs = new pgs((Throwable)paramThrowable);
    if (a.a(this, null, localpgs))
    {
      d();
      return true;
    }
    return false;
  }
  
  protected boolean a(pic<? extends V> parampic)
  {
    if (parampic == null) {
      throw new NullPointerException();
    }
    Object localObject = this.value;
    if (localObject == null)
    {
      if (parampic.isDone()) {
        return a(parampic, null);
      }
      pgw localpgw = new pgw(this, parampic);
      if (a.a(this, null, localpgw)) {
        for (;;)
        {
          try
          {
            parampic.a(localpgw, pii.a);
            return true;
          }
          catch (Throwable localThrowable1) {}
          try
          {
            localpgs = new pgs(localThrowable1);
            a.a(this, localpgw, localpgs);
          }
          catch (Throwable localThrowable2)
          {
            for (;;)
            {
              pgs localpgs = pgs.a;
            }
          }
        }
      }
      localObject = this.value;
    }
    if ((localObject instanceof pgr)) {
      parampic.cancel(((pgr)localObject).a);
    }
    return false;
  }
  
  final boolean a(pic<? extends V> parampic, Object paramObject)
  {
    Object localObject;
    if ((parampic instanceof pgy)) {
      localObject = ((pgp)parampic).value;
    }
    while (a.a(this, paramObject, localObject))
    {
      d();
      return true;
      try
      {
        localObject = efj.a(parampic);
        if (localObject == null) {
          localObject = d;
        }
      }
      catch (ExecutionException localExecutionException)
      {
        localObject = new pgs(localExecutionException.getCause());
      }
      catch (CancellationException localCancellationException)
      {
        localObject = new pgr(false, localCancellationException);
      }
      catch (Throwable localThrowable)
      {
        localObject = new pgs(localThrowable);
      }
    }
    return false;
  }
  
  protected final boolean b()
  {
    Object localObject = this.value;
    return ((localObject instanceof pgr)) && (((pgr)localObject).a);
  }
  
  void c() {}
  
  public boolean cancel(boolean paramBoolean)
  {
    Object localObject1 = this.value;
    int i;
    CancellationException localCancellationException;
    label38:
    pgr localpgr;
    Object localObject2;
    if (localObject1 == null)
    {
      i = 1;
      if ((i | localObject1 instanceof pgw) == 0) {
        break label129;
      }
      if (!b) {
        break label109;
      }
      localCancellationException = new CancellationException("Future.cancel() was called.");
      localpgr = new pgr(paramBoolean, localCancellationException);
      localObject2 = localObject1;
    }
    label109:
    do
    {
      if (a.a(this, localObject2, localpgr))
      {
        if (paramBoolean) {
          a();
        }
        d();
        if ((localObject2 instanceof pgw)) {
          ((pgw)localObject2).a.cancel(paramBoolean);
        }
        return true;
        i = 0;
        break;
        localCancellationException = null;
        break label38;
      }
      localObject2 = this.value;
    } while ((localObject2 instanceof pgw));
    label129:
    return false;
  }
  
  public V get()
  {
    if (Thread.interrupted()) {
      throw new InterruptedException();
    }
    Object localObject1 = this.value;
    int i;
    if (localObject1 != null)
    {
      i = 1;
      if ((localObject1 instanceof pgw)) {
        break label50;
      }
    }
    label50:
    for (int j = 1;; j = 0)
    {
      if ((i & j) == 0) {
        break label55;
      }
      return b(localObject1);
      i = 0;
      break;
    }
    label55:
    phb localphb1 = this.waiters;
    if (localphb1 != phb.a)
    {
      phb localphb2 = new phb((byte)0);
      label172:
      label176:
      do
      {
        a.a(localphb2, localphb1);
        if (a.a(this, localphb1, localphb2)) {
          for (;;)
          {
            LockSupport.park(this);
            if (Thread.interrupted())
            {
              a(localphb2);
              throw new InterruptedException();
            }
            Object localObject2 = this.value;
            int k;
            if (localObject2 != null)
            {
              k = 1;
              if ((localObject2 instanceof pgw)) {
                break label172;
              }
            }
            for (int m = 1;; m = 0)
            {
              if ((k & m) == 0) {
                break label176;
              }
              return b(localObject2);
              k = 0;
              break;
            }
          }
        }
        localphb1 = this.waiters;
      } while (localphb1 != phb.a);
    }
    return b(this.value);
  }
  
  public V get(long paramLong, TimeUnit paramTimeUnit)
  {
    long l1 = paramTimeUnit.toNanos(paramLong);
    if (Thread.interrupted()) {
      throw new InterruptedException();
    }
    Object localObject1 = this.value;
    int i;
    if (localObject1 != null)
    {
      i = 1;
      if ((localObject1 instanceof pgw)) {
        break label66;
      }
    }
    label66:
    for (int j = 1;; j = 0)
    {
      if ((i & j) == 0) {
        break label72;
      }
      return b(localObject1);
      i = 0;
      break;
    }
    label72:
    long l2;
    phb localphb1;
    phb localphb2;
    long l3;
    if (l1 > 0L)
    {
      l2 = l1 + System.nanoTime();
      if (l1 < 1000L) {
        break label367;
      }
      localphb1 = this.waiters;
      if (localphb1 == phb.a) {
        break label314;
      }
      localphb2 = new phb((byte)0);
      a.a(localphb2, localphb1);
      if (a.a(this, localphb1, localphb2)) {
        l3 = l1;
      }
    }
    else
    {
      label225:
      label231:
      do
      {
        LockSupport.parkNanos(this, l3);
        if (Thread.interrupted())
        {
          a(localphb2);
          throw new InterruptedException();
          l2 = 0L;
          break;
        }
        Object localObject3 = this.value;
        int n;
        if (localObject3 != null)
        {
          n = 1;
          if ((localObject3 instanceof pgw)) {
            break label225;
          }
        }
        for (int i1 = 1;; i1 = 0)
        {
          if ((n & i1) == 0) {
            break label231;
          }
          return b(localObject3);
          n = 0;
          break;
        }
        l3 = l2 - System.nanoTime();
      } while (l3 >= 1000L);
      a(localphb2);
    }
    for (;;)
    {
      if (l3 > 0L)
      {
        Object localObject2 = this.value;
        int k;
        if (localObject2 != null)
        {
          k = 1;
          label275:
          if ((localObject2 instanceof pgw)) {
            break label328;
          }
        }
        label314:
        label328:
        for (int m = 1;; m = 0)
        {
          if ((k & m) == 0) {
            break label334;
          }
          return b(localObject2);
          localphb1 = this.waiters;
          if (localphb1 != phb.a) {
            break;
          }
          return b(this.value);
          k = 0;
          break label275;
        }
        label334:
        if (Thread.interrupted()) {
          throw new InterruptedException();
        }
        l3 = l2 - System.nanoTime();
      }
      else
      {
        throw new TimeoutException();
        label367:
        l3 = l1;
      }
    }
  }
  
  public boolean isCancelled()
  {
    return this.value instanceof pgr;
  }
  
  public boolean isDone()
  {
    int i = 1;
    Object localObject = this.value;
    int j;
    if (localObject != null)
    {
      j = i;
      if ((localObject instanceof pgw)) {
        break label29;
      }
    }
    for (;;)
    {
      return j & i;
      j = 0;
      break;
      label29:
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pgp
 * JD-Core Version:    0.7.0.1
 */