package genetic;
import java.util.ArrayList;
class Thought35 extends Thought{
private static ArrayList<Thought35> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 579.1683117441181;
private double fd1 = 171.9031630926198;
private Thought fo0 = null;
private Thought fo1 = null;
Thought35 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought35 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought35 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought35 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought35 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought35 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought35 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought35 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought35 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought35 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought35 instance = new Thought35 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 466.5035221827354;
    Thought lo1 = Thought298.getInstance();
    Thought lo2 = Thought130.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    Output.points[3][1] -= fd1;
    ld0 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 570.6574063357261;
    boolean lb1 = true;
    Output.points[3][2] += ld0;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    ab2 = ld0 > fd0;
    boolean lb2 = false;
    Thought lo3 = Thought181.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
if(fo1 != null){
      ab2 = fo1.m2(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
      fo1.m3();
}
    double ld4 = 878.9741789348998;
    ab3 = ab4 && fb0;
    fb1 = lb1 && lb2;
    ab1 = ab2 || ab3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo0.m1(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
    lb0 = !lb1;
    Output.points[3][3] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo0.m1(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
        fb0 = fb1 && lb0;
        boolean lb2 = true;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo3 = Thought335.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, lb1, fb0, fb1);
        lb2 = lb0 || lb1;
if(fo0 != null){
          ad1 = fo0.m3(fb0, fb1, lb2, lb0);
}
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Thought lo4 = Thought58.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    fb0 = !fb1;
    lb0 = lb1 && fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    double ld0 = 338.50124967492764;
    ab2 = ab3 || ab4;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    Output.points[3][4] -= ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2();
}
    ab1 = fd0 < fd1;
    double ld1 = 353.03933952998943;
    double ld2 = 966.9179135222686;
    Thought lo3 = Thought161.getInstance(fo1, fo0, fo1, fo0, ld0, ld1, ld2, ad1, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought368.getInstance(fo1, fo0, fo1, fo0);
    ad2 = ad3 - ad4;
    boolean lb5 = false;
    Output.points[3][5] += fd0;
    lb5 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
        ld1 = ld2 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 + ld1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 903.1637052640181;
    Thought lo1 = Thought378.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Output.points[3][6] -= fd1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    Thought lo3 = Thought160.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
    ld0 = fd0 + fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 664.5296255548503;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    double ld2 = 110.62941814137857;
    Thought lo3 = Thought115.getInstance();
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld0, ld2, ad1, ad2, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    ld0 = ld2 + ad1;
    boolean lb4 = false;
    boolean lb5 = false;
    Thought lo6 = Thought61.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
if(ao2 != null){
      fd1 = ao2.m3(ld0, ld2, ad1, ad2, lb5, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb4, lb5, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, lb1, lb4, lb5, fb0);
}
    boolean lb7 = true;
    ld2 *= -1;
    Thought lo8 = Thought289.getInstance(fb0, fb1, lb1, lb4);
    lb5 = !lb7;
    fb0 = fb1 && lb1;
    double ld9 = 733.5371190284611;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought43.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        fb0 = !fb1;
        ab1 = !ab2;
        ab3 = !ab4;
        fd1 = fd0 + fd1;
        fb0 = fd0 < fd1;
if(ao1 != null){
          ao1.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        double ld1 = 833.6217831239823;
        Output.points[3][7] += ld1;
        Output.points[3][8] += fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
        fd1 *= -1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3();
}
    Output.points[4][0] += ad2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought181.getInstance(fb1, ab1, ab2, ab3);
    ab4 = ad1 < ad2;
    Thought lo1 = Thought383.getInstance(ao3, ao4, fo0, fo1);
    ad3 = ad4 + fd0;
        fb0 = fb1 && ab1;
    if (ab2) {
        fd1 *= -1;
        Output.points[4][1] += ad1;
        ad2 = ad3 + ad4;
        ab3 = ab4 && fb0;
        double ld2 = 702.4549505061857;
        } else {
        fb1 = ab1 && ab2;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
        boolean lb3 = true;
        ab2 = !ab3;
        double ld4 = 456.0303358154628;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought5.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    Thought lo2 = Thought171.getInstance(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = lb3 && fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb1, lb3, fb0);
}
    fd1 = fd0 - fd1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
    ab3 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought294.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
    fb1 = ad3 > ad4;
    fb0 = !fb1;
    boolean lb1 = true;
    double ld2 = 720.0591872532372;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
}
    double ld3 = 493.7248393336853;
    fb0 = ld3 > ad1;
    fb1 = ad2 < ad3;
    lb1 = fb0 && fb1;
    lb1 = !fb0;
if(fo0 != null){
      fo0.m3(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    ad4 *= -1;
    boolean lb4 = true;
    lb1 = !lb4;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb4 = fd0 < fd1;
    fb0 = ld2 < ld3;
    Output.points[4][2] += ad1;
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab2 = ab3 || ab4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought305.getInstance();
    ad3 = ad4 + fd0;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    if (fb0) {
if(ao4 != null){
          fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
        Output.points[4][3] -= fd0;
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2();
}
        fb0 = fd1 < fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        fb1 = fd1 > fd0;
        fd1 = fd0 + fd1;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought360.getInstance(ao3, ao4, fo0, fo1);
        fb0 = fb1 && fb0;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(ao2 != null){
      fb0 = ao2.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    ad1 = ad2 - ad3;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fb1 = ad4 > fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    ad1 *= -1;
    Thought lo1 = Thought153.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
    fb0 = !fb1;
    lb0 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > ad1;
    Thought lo2 = Thought197.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      lb0 = ao3.m2();
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    ab4 = fd1 < fd0;
    Thought lo1 = Thought107.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Output.points[4][4] += fd0;
    lb2 = !ab1;
    ab2 = !ab3;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = ad2 > ad3;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1();
}
    ab4 = fb0 || fb1;
    ad4 = fd0 - fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
        Output.points[4][5] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought285.getInstance(ao2, ao3, ao4, fo0);
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 || ab3;
    boolean lb2 = true;
    Thought lo3 = Thought341.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    ad1 = ad2 + ad3;
    lb0 = !lb2;
    double ld4 = 71.60084532340994;
    Thought lo5 = Thought5.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = fd0 > fd1;
        fb1 = fd0 < fd1;
    double ld2 = 475.39922975345456;
    ld2 = fd0 + fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    lb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(ld2, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
    Output.points[4][6] -= fd0;
    boolean lb3 = true;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought391.getInstance();
    ab2 = fd1 > fd0;
    ab3 = fd1 < fd0;
    Thought lo1 = Thought53.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fb1 = ab1 || ab2;
    Thought lo2 = Thought106.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    ad4 *= -1;
    Thought lo0 = Thought253.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    fb1 = ad3 > ad4;
    boolean lb1 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    double ld3 = 625.6288469635273;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld3);
}
    lb2 = fb0 && fb1;
    lb1 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb1);
}
    fd0 *= -1;
    lb2 = fb0 || fb1;
    fd1 = ld3 + ad1;
    lb1 = lb2 && fb0;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    double ld0 = 327.1065783703626;
if(fo1 != null){
      fb1 = fo1.m2();
}
        ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fb0, fb1, ab1, ab2);
}
        ad4 *= -1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, ad1, ad2);
}
        ab3 = ad3 < ad4;
        Thought lo1 = Thought50.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
        }
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb2, ab1);
}
    Thought lo3 = Thought108.getInstance(ab2, ab3, ab4, fb0);
    boolean lb4 = true;
    double ld5 = 54.81697155374397;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    Output.points[4][7] += ld5;
    Thought lo6 = Thought375.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ld0;

Thought.STACK_COUNTER++;
return ld5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        }
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = lb1 || fb0;
    fb1 = lb0 && lb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(ao1 != null){
      ao1.m3();
}
    fb1 = fd1 < fd0;
    lb0 = fd1 < fd0;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought208.getInstance(lb0, lb1, lb2, fb0);
    fd1 = fd0 + fd1;
    fb1 = lb0 && lb1;
    lb2 = fd0 < fd1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fb1 = fb0 && fb1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 636.9136483193726;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2();
}
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fd0 = fd1 + ld0;
    fb0 = !fb1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought395.getInstance(fb0, fb1, fb0, fb1);
    Thought lo2 = Thought374.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ld0, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m3(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && ab1;
    boolean lb0 = false;
    double ld1 = 819.2166671449662;
    boolean lb2 = true;
    lb2 = ld1 < fd0;
    fd1 = ld1 - fd0;
    Thought lo3 = Thought316.getInstance(fd1, ld1, fd0, fd1);
    ld1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 920.6986448314871;
    ab1 = ab2 && ab3;
    ld0 = ad1 - ad2;
if(ao2 != null){
      ab4 = ao2.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    double ld2 = 342.9091125524665;
    ld0 = ld2 + ad1;
    ad2 *= -1;
    ab2 = ad3 < ad4;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld2, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
        ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb1, ab1);
}
    Output.points[4][8] += ld0;

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    double ld0 = 961.7365585078071;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought165.getInstance(fd0, fd1, ld0, fd0);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    boolean lb2 = false;
    Thought lo3 = Thought30.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
    fd1 = ld0 - fd0;
    Output.points[5][0] += fd1;
    boolean lb4 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ld0 *= -1;
    lb4 = !fb0;
    fb1 = !lb2;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[5][1] -= fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    ab1 = ab2 && ab3;
    fd0 *= -1;
    fd1 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fd1 > fd0;
    fb1 = lb0 && ab1;
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = false;
    ad1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
        fd1 = ad1 - ad2;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
        lb1 = fb0 || fb1;
        Output.points[5][2] -= ad3;
        double ld3 = 758.050384165698;
if(fo0 != null){
          ad3 = fo0.m3(lb2, lb0, lb1, fb0);
}
        fb1 = lb2 || lb0;
        lb1 = ad4 < fd0;
        fb0 = fd1 > ld3;
        double ld4 = 433.636963808277;
        ld4 *= -1;
        fb1 = lb2 && lb0;
        lb1 = fb0 || fb1;
        double ld5 = 346.4445672167151;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    ad3 *= -1;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        ab1 = ab2 && ab3;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        boolean lb1 = false;
if(fo1 != null){
          fo1.m1(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
        Output.points[5][3] -= ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
}
        ad4 = fd0 - fd1;
if(fo1 != null){
          ad1 = fo1.m3();
}
        }
    fb0 = !fb1;
    boolean lb2 = true;
    Thought lo3 = Thought271.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    lb2 = !ab1;
    ab2 = fd1 > ad1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(ao1 != null){
      lb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    double ld2 = 227.6643955806561;
    Output.points[5][4] -= ld2;
    fd0 = fd1 + ld2;
    lb1 = fb0 && fb1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        double ld3 = 372.76458991121933;
        Output.points[5][5] += fd0;
        boolean lb4 = false;
        lb4 = fd1 < ld3;
if(ao2 != null){
          ld2 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld3, ld2);
}
        lb0 = lb1 && fb0;
        fb1 = lb4 || lb0;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld3, ld2, lb1, fb0, fb1, lb4);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, fb0, fb1);
}
        lb4 = lb0 || lb1;
        boolean lb5 = true;
        fd0 = fd1 - ld3;
if(ao4 != null){
          ao3 = ao4.m4();
}
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = ad1 - ad2;
        fb1 = ad3 < ad4;
        fb0 = fb1 && fb0;
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
            fb1 = fb0 || fb1;
            boolean lb0 = true;
if(ao4 != null){
              ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
            ad3 = ad4 + fd0;
if(fo0 != null){
              fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
            lb0 = ad4 > fd0;
            boolean lb1 = false;
if(ao4 != null){
              ao4.m2(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
            boolean lb2 = true;
            double ld3 = 767.2077423259852;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, lb2, fb0, fb1);
}
            lb0 = !lb1;
if(fo0 != null){
              fo0.m1();
}
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[5][6] += fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
    Output.points[5][7] -= fd1;
    for(int i0=0; i0<10; i0++){
        ab3 = ab4 && fb0;
        fd0 = fd1 - fd0;
        Output.points[5][8] -= fd1;
        fb1 = !ab1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        ab2 = !ab3;
        double ld0 = 425.39166310499024;
        Output.points[6][0] += ld0;
if(ao2 != null){
          fd0 = ao2.m3(fd1, ld0, fd0, fd1);
}
        boolean lb1 = true;
        }
    Thought lo2 = Thought53.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    Output.points[6][1] += ad1;
    if (fb0) {
        fb1 = ab1 || ab2;
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 < ad1;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
            boolean lb0 = false;
            boolean lb1 = true;
}}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought208.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 505.8992094742006;
    fb1 = ld1 > fd0;
    fd1 *= -1;
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fb0 = !fb1;
    fd1 *= -1;
    fb0 = !fb1;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
    Output.points[6][2] -= fd0;
        Output.points[6][3] += fd1;
    Thought lo3 = Thought12.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
    ld1 = fd0 + fd1;
    fb1 = !lb2;
    boolean lb4 = false;
if(fo1 != null){
      ld1 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb4, fb0, fb1, lb2);
}
if(fo1 != null){
      fd1 = fo1.m3(lb4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo5 = Thought290.getInstance(ld1, fd0, fd1, ld1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 853.2149915742149;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
    Thought lo2 = Thought314.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
    fd1 *= -1;
    fb1 = ld0 > fd0;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb1, lb3, fb0, fb1);
}
    ld0 *= -1;
if(fo0 != null){
      lb1 = fo0.m2(lb3, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought385.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 549.6826223183235;
        fb0 = !fb1;
    Thought lo2 = Thought386.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
