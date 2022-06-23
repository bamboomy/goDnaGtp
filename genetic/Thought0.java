package genetic;
import java.util.ArrayList;
class Thought0 extends Thought{
private static ArrayList<Thought0> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 160.9265142943903;
private double fd1 = 672.9633297427855;
private Thought fo0 = null;
private Thought fo1 = null;
Thought0 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought0 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought0 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought0 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought0 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought0 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought0 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought0 instance = new Thought0 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    Thought lo0 = Thought81.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought80.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    boolean lb2 = false;
    if (lb2) {
        double ld3 = 626.5649884329681;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = false;
    fd1 *= -1;
    lb0 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    lb0 = ab1 && ab2;
    boolean lb1 = true;
    Thought lo2 = Thought30.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    Thought lo3 = Thought59.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
    boolean lb4 = true;
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    double ld5 = 291.9648087818651;
    Thought lo6 = Thought45.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0);

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
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
    double ld0 = 958.0162969383102;
    ad3 = ad4 - fd0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    double ld2 = 284.9255580561704;
    if (lb1) {
        fd0 = fd1 - ld0;
        fb0 = !fb1;
        ld2 = ad1 - ad2;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab4 = fo0.m2(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    boolean lb0 = true;
    Thought lo1 = Thought2.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);

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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 183.86165748458356;
    fb0 = !fb1;
    Output.points[0][0] += ld0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && fb0;
    boolean lb1 = true;
    fb0 = !fb1;
    Thought lo2 = Thought54.getInstance(lb1, fb0, fb1, lb1);
        ld0 = fd0 + fd1;
    fb0 = fb1 && lb1;
    fb0 = ld0 > fd0;
    boolean lb3 = false;

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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao1 != null){
      ad1 = ao1.m3();
}
    Thought lo0 = Thought23.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad1 *= -1;
    fb0 = fb1 && fb0;
    ad2 = ad3 + ad4;
    boolean lb1 = true;
    Thought lo2 = Thought8.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);

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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[0][1] += fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought91.getInstance();
    fb0 = fd0 < fd1;
    double ld1 = 302.9304073123901;
    double ld2 = 313.5613715506491;
    double ld3 = 101.98826800702882;
    fb1 = !ab1;
if(ao2 != null){
      ao1 = ao2.m4(ld1, ld2, ld3, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought7.getInstance(ao3, ao4, fo0, fo1);
    boolean lb5 = false;
    fd1 = ld1 + ld2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld1, fb0, fb1, lb5, ab1);
}
    double ld6 = 379.9479804507681;
    double ld7 = 810.2990368648735;
    ld2 = ld3 + ld6;
    boolean lb8 = true;
    ld7 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m1(ld1, ld2, ld3, ld6);
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
    boolean lb0 = false;
    ab1 = ad1 > ad2;
    Thought lo1 = Thought9.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    ab2 = !ab3;
    ab4 = ad1 > ad2;
    Thought lo2 = Thought51.getInstance(fb0, fb1, lb0, ab1);
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad3 = ad4 + fd0;
    boolean lb3 = false;
    boolean lb4 = false;
    double ld5 = 199.73658156844888;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld5, ad1, lb4, ab1, ab2, ab3);
}
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb3 = lb4 || ab1;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought19.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    Output.points[0][2] += fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3();
}
    Output.points[0][3] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return lb1;
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
    ab2 = !ab3;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    ab2 = fd1 > fd0;
    fd1 *= -1;
    double ld2 = 459.1438038957356;
    boolean lb3 = true;
    ab2 = ld2 < fd0;
    ab3 = !ab4;
    Thought lo4 = Thought61.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
    lb3 = ab1 || ab2;
    ab3 = ab4 && fb0;
    ld2 = fd0 - fd1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb3);
}
    fd0 = fd1 - ld2;
    fd0 *= -1;
    double ld5 = 345.95211809701374;
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, ld5);
}
    fd0 = fd1 + ld2;
    Output.points[0][4] += ld5;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld5);
}
if(fo1 != null){
      fd0 = fo1.m3(lb6, ab1, ab2, ab3);
}
    fd1 = ld2 - ld5;
    ab4 = fd0 < fd1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought15.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    boolean lb1 = false;
    boolean lb2 = false;
    Output.points[0][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;

Thought.STACK_COUNTER++;
return lb1;
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
    double ld0 = 72.64912112309388;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 > fd0;
    boolean lb1 = false;
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
        Output.points[0][6] += ad1;
    ab4 = fb0 || fb1;
    boolean lb2 = false;
    boolean lb3 = false;
    ad2 = ad3 - ad4;

Thought.STACK_COUNTER++;
return lb1;
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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    lb0 = fd1 < fd0;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo0.m2();
}
    boolean lb1 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb0 = true;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
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
    double ld0 = 691.3023257330059;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
    boolean lb1 = true;
    double ld2 = 995.8797646923078;
    lb1 = ld2 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld2, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ld0 - ld2;
    fd0 = fd1 + ld0;
    ld2 = fd0 - fd1;
    Thought lo3 = Thought82.getInstance(ld0, ld2, fd0, fd1, fb0, fb1, lb1, ab1);
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ld0 = ld2 - fd0;
    fd1 = ld0 - ld2;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld2, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        ab4 = !fb0;
        fb1 = !lb1;
        ab1 = ab2 || ab3;
        ab4 = fd0 > fd1;
if(fo0 != null){
          fo0.m1(ld0, ld2, fd0, fd1);
}
        Thought lo4 = Thought40.getInstance(fo1, ao1, ao2, ao3, ld0, ld2, fd0, fd1);
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, lb1, ab1);
}
if(fo1 != null){
          fo1.m1();
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = !ab1;
    fd1 *= -1;
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    ab2 = ad1 < ad2;
    ab3 = ad3 < ad4;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    if (ab3) {
        ab4 = ad3 > ad4;
        fd0 = fd1 - ad1;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
    double ld0 = 842.4099266197971;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && lb1;
        double ld2 = 688.3994692953639;
    ld2 = fd0 + fd1;

Thought.STACK_COUNTER++;
return ld0;
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
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought50.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought37.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, lb2, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fd1 = fd0 + fd1;
    Thought lo3 = Thought41.getInstance(fo1, fo0, fo1, fo0);
    fb1 = !lb2;
    Thought lo4 = Thought8.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fd0 *= -1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, ab1, ab2);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb5 = true;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb2);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3();
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
    Output.points[0][7] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought25.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    lb2 = ad3 < ad4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    fb1 = lb1 || lb2;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    fd0 *= -1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought35.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    lb0 = !lb1;
    ad3 = ad4 - fd0;
    boolean lb3 = true;
    fd1 *= -1;
    boolean lb4 = true;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, lb4, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(ab4, fb0, fb1, lb0);
}
        lb1 = !lb3;
        double ld5 = 823.3649620998126;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
if(ao2 != null){
          fb0 = ao2.m2();
}
        Thought lo0 = Thought59.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fb1 = fd1 > fd0;
        boolean lb1 = true;
        boolean lb2 = true;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, lb1, lb2, fb0, fb1);
}
        fd0 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
        lb1 = lb2 || fb0;
        fd1 *= -1;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 527.0814805537194;
    fb1 = ld0 < ad1;
    Thought lo1 = Thought52.getInstance(ao1, ao2, ao3, ao4);
    Thought lo2 = Thought73.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    Output.points[0][8] += fd1;
    Thought lo3 = Thought50.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fb1 = ld0 < ad1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        lb0 = fd0 < fd1;
if(ao1 != null){
          fd0 = ao1.m3(ab1, ab2, ab3, ab4);
}
        fd1 = fd0 - fd1;
        boolean lb1 = false;
        fd0 = fd1 + fd0;
        }
    double ld2 = 672.7776707744924;

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
    ab2 = ad1 > ad2;
    ad3 = ad4 + fd0;
    ab3 = !ab4;
    fb0 = fb1 || ab1;
        ab2 = fd1 > ad1;
    ad2 *= -1;
    boolean lb0 = false;
if(ao2 != null){
      ad3 = ao2.m3();
}
    ad4 *= -1;
    fd0 *= -1;
if(ao3 != null){
      ab2 = ao3.m2(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
    lb0 = ad1 > ad2;
    ab1 = ab2 && ab3;
    ad3 = ad4 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought29.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 768.8703075833464;
    Output.points[1][0] += ld1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    ld1 *= -1;
    fb0 = fd0 < fd1;
    boolean lb2 = false;
    ld1 = fd0 - fd1;
    boolean lb3 = false;
    ld1 = fd0 + fd1;
if(fo0 != null){
      ld1 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, fd0, lb3, fb0, fb1, lb2);
}
    fd1 *= -1;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb2;
    lb3 = fb0 && fb1;

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
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    Output.points[1][1] -= fd1;
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    double ld0 = 975.3945685609979;
    Thought lo1 = Thought12.getInstance(ld0, fd0, fd1, ld0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[1][2] += ld0;
    fd0 = fd1 + ld0;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb2);
}
    fd1 = ld0 + fd0;

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
    Thought lo0 = Thought29.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    fb1 = ad2 < ad3;
    double ld1 = 524.0123378483963;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ld1 = fo1.m3();
}
    fb0 = ad1 < ad2;
    fb1 = ad3 < ad4;
    fb0 = fb1 && fb0;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld1;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < ld1;
        for(int i1=0; i1<10; i1++){
            boolean lb2 = false;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    lb0 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld1 = 406.59769811408484;
    Output.points[1][3] -= fd0;
    Thought lo2 = Thought82.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ad1, ad2);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab2 = ab3 || ab4;
    boolean lb3 = true;
if(fo0 != null){
      ld1 = fo0.m3(ab4, fb0, fb1, lb0);
}
    double ld4 = 519.2784918412232;
    ld4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb3 = ab1 || ab2;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 > fd1;
    ld1 *= -1;
    ld4 = ad1 + ad2;
    boolean lb5 = true;
    ad3 *= -1;
    lb3 = ad4 < fd0;

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
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought69.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Output.points[1][4] += fd0;
    Thought lo1 = Thought56.getInstance(fd1, fd0, fd1, fd0);
    Output.points[1][5] += fd1;
    boolean lb2 = false;
    lb2 = fd0 < fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought84.getInstance();
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        Thought lo4 = Thought78.getInstance(fd0, fd1, fd0, fd1, fb1, lb2, fb0, fb1);
        boolean lb5 = false;
if(fo0 != null){
          lb5 = fo0.m2(fo1, ao1, ao2, ao3);
}
        boolean lb6 = true;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb6, lb2, fb0, fb1);
}
        double ld7 = 80.5331563100034;
        lb5 = ld7 > fd0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, lb6, lb2, fb0, fb1);
}
        ld7 = fd0 - fd1;
        lb5 = lb6 || lb2;
if(ao3 != null){
          fb0 = ao3.m2(ld7, fd0, fd1, ld7);
}
        fd0 *= -1;
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
    if (fb0) {
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = ad1 - ad2;
        Output.points[1][6] -= ad3;
        if (fb1) {
            ad4 = fd0 - fd1;
            for(int i0=0; i0<10; i0++){
if(ao1 != null){
                  ao1.m1(ao2, ao3, ao4, fo0);
}
                ad1 = ad2 - ad3;
if(fo1 != null){
                  fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
                ad2 *= -1;
                Thought lo0 = Thought99.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
                ad3 = ad4 - fd0;
if(ao3 != null){
                  ao3.m3(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
                  fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
                boolean lb1 = true;
                ad2 = ad3 + ad4;
                fd0 = fd1 - ad1;
                lb1 = fb0 && fb1;
                lb1 = !fb0;
}}}
Thought.STACK_COUNTER++;
return ao3;
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
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    double ld0 = 156.4289055109071;
    ab2 = ld0 > fd0;
    fd1 = ld0 - fd0;
    ab3 = fd1 < ld0;
if(ao4 != null){
      ab4 = ao4.m2();
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    Output.points[1][7] -= fd1;
    boolean lb2 = true;
    Thought lo3 = Thought98.getInstance(fo1, ao1, ao2, ao3);
    ld0 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    boolean lb0 = false;
    ab1 = ab2 || ab3;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    ab4 = ad4 > fd0;
    Output.points[1][8] += fd1;
    fb0 = ad1 > ad2;
    ad3 *= -1;
    boolean lb1 = true;
    Thought lo2 = Thought27.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      ad3 = ao1.m3();
}
    boolean lb3 = false;
    lb3 = ab1 || ab2;
if(ao2 != null){
      ao2.m1(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    double ld4 = 988.8060382075689;

Thought.STACK_COUNTER++;
return ao3;
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
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    double ld2 = 696.1405691844714;
    lb0 = ld2 > fd0;

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
    fd0 = fd1 - fd0;
    Thought lo0 = Thought72.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    double ld1 = 580.9810970754387;
    fd0 = fd1 - ld1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3();
}
    fd1 = ld1 + fd0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;

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
    double ld0 = 692.8040119261432;
        boolean lb1 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ld0 = fd0 + fd1;
    boolean lb2 = true;
    ld0 *= -1;
    boolean lb3 = true;
    double ld4 = 725.4246513684275;
    ld4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld4, fd0, lb3, fb0, fb1, lb1);
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
