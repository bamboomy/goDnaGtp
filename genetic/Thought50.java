package genetic;
import java.util.ArrayList;
class Thought50 extends Thought{
private static ArrayList<Thought50> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 877.5785042247279;
private double fd1 = 709.8249853254546;
private Thought fo0 = null;
private Thought fo1 = null;
Thought50 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought50 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought50 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought50 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought50 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought50 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought50 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought50 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought50 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought50 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought50 instance = new Thought50 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 *= -1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    double ld0 = 789.4939140190584;
    Thought lo1 = Thought2.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
    Thought lo2 = Thought39.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld3 = 929.9829943763282;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ld0 = ld3 + fd0;
    Thought lo4 = Thought38.getInstance(fd1, ld0, ld3, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2();
}
        Output.points[2][2] -= fd1;

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
    double ld0 = 121.45325714023691;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
    ld0 = fd0 - fd1;
    fb0 = fb1 && ab1;
    Output.points[2][3] += ld0;
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    boolean lb1 = false;
    Thought lo2 = Thought38.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    fd1 = ld0 - fd0;
    boolean lb3 = false;
    boolean lb4 = false;
    fd1 = ld0 + fd0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb1 = !fb0;
    Output.points[2][4] += ad4;
    Thought lo0 = Thought31.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);

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
    ab2 = ad1 > ad2;
    boolean lb0 = false;
    ad3 = ad4 + fd0;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    ab4 = ad3 > ad4;
    Output.points[2][5] -= fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    Output.points[2][6] -= fd1;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought54.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought37.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought58.getInstance();
    boolean lb2 = true;
    lb2 = !fb0;
    fd0 *= -1;
    boolean lb3 = false;
    boolean lb4 = true;
    fd1 = ad1 + ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    lb4 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb2, lb3, lb4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[2][7] -= fd0;
    ab2 = fd1 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb0 = false;
    double ld1 = 359.4639215927228;
    boolean lb2 = true;
    boolean lb3 = false;
    fd0 = fd1 - ld1;
    fd0 = fd1 + ld1;
    Output.points[2][8] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4();
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
    ab1 = !ab2;
    ad1 = ad2 + ad3;
    ab3 = ad4 < fd0;
    fd1 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ab4 = ad1 < ad2;
    Output.points[3][0] += ad3;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
    ab3 = ad2 > ad3;
    ad4 = fd0 - fd1;

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
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fd1 = fd0 - fd1;
    Output.points[3][1] -= fd0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought46.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    Output.points[3][2] -= fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    Thought lo0 = Thought2.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    fd0 = fd1 + fd0;
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    double ld1 = 380.14459700329354;
    ab2 = !ab3;
    if (ab4) {
        ld1 = fd0 - fd1;
        ld1 = fd0 + fd1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
        fb1 = ab1 || ab2;
        ab3 = ab4 || fb0;
        Thought lo2 = Thought33.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
        boolean lb3 = false;
        double ld4 = 431.64414507152924;
        fd0 = fd1 - ld4;
        ab3 = ab4 || fb0;
        boolean lb5 = false;
        ld1 = fd0 + fd1;
        ld4 = ld1 + fd0;
        fd1 *= -1;
        Thought lo6 = Thought66.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb3, lb5);
        boolean lb7 = true;
}
Thought.STACK_COUNTER++;
return ab3;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
    fb1 = fb0 || fb1;
    fb0 = ad4 > fd0;
    fd1 *= -1;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 + ad1;
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    lb0 = fd0 > fd1;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ad3 > ad4;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        ad1 = ad2 - ad3;
        ad4 *= -1;
        fd0 *= -1;
        fd1 = ad1 + ad2;
        ab3 = ad3 < ad4;
        fd0 = fd1 - ad1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
        ab4 = fb0 || fb1;
        ab1 = ab2 || ab3;
if(fo1 != null){
          fo1.m2(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return ab1;
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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought17.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    Thought lo1 = Thought98.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m2(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = !fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    double ld2 = 750.6032482994997;

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
    fb0 = fb1 && fb0;
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    fd0 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought49.getInstance(fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
    lb0 = ad4 < fd0;
    fb0 = fd1 < ad1;
    fb1 = lb0 || fb0;
    boolean lb2 = false;
    double ld3 = 988.2396785827036;
    ad1 = ad2 - ad3;
    Thought lo4 = Thought84.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld3);
}
    double ld5 = 406.8861998097083;
    fb0 = fb1 && lb0;
    boolean lb6 = true;
    double ld7 = 128.81510369016198;

Thought.STACK_COUNTER++;
return lb2;
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
    double ld0 = 405.62363213766025;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    double ld3 = 247.95324244545267;
    ld3 = fd0 - fd1;
        double ld4 = 607.2133810846182;
    lb1 = lb2 && ab1;
    double ld5 = 762.9736410951826;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb2);
}
    boolean lb6 = false;
    ld0 = ld3 + ld4;
    lb6 = ld5 < fd0;
    fd1 *= -1;
    ld0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    if (ab1) {
        ab2 = !ab3;
        ld3 = ld4 - ld5;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 *= -1;
    Thought lo1 = Thought68.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 > ad1;
if(ao2 != null){
      ao2.m3();
}
    fb1 = ad2 > ad3;
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ad1, ad2);
}
    lb0 = ab1 && ab2;
if(ao4 != null){
      ao4.m3(ab3, ab4, fb0, fb1);
}
    lb0 = ad3 < ad4;
    fd0 = fd1 - ad1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    Output.points[3][3] += ad1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
    ad3 = ad4 + fd0;
    ab1 = ab2 && ab3;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 12.326149332874346;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - fd0;
    Output.points[3][4] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    Output.points[3][5] += fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    Thought lo2 = Thought64.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
    boolean lb3 = true;
    boolean lb4 = false;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 872.1147197950636;
    ld0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought70.getInstance();
    boolean lb2 = false;
    boolean lb3 = false;
    fd1 *= -1;
    ab3 = !ab4;
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0);
}
    Thought lo4 = Thought0.getInstance(fb0, fb1, lb2, lb3);
    ab1 = ab2 && ab3;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    Thought lo5 = Thought17.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb2);
    fd1 = ld0 - fd0;
    lb3 = ab1 || ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
    lb3 = !ab1;
    fd1 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    if (ab3) {
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    if (fb0) {
        Thought lo1 = Thought83.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
        boolean lb2 = true;
        if (lb2) {
            lb0 = fb0 || fb1;
            Thought lo3 = Thought15.getInstance(fo0, fo1, fo0, fo1, lb2, lb0, fb0, fb1);
            } else if (lb2) {
if(fo0 != null){
              ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
            boolean lb4 = false;
            lb2 = lb0 || fb0;
            fb1 = ad3 > ad4;
            lb4 = fd0 > fd1;
}}
Thought.STACK_COUNTER++;
return ad1;
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
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    double ld0 = 0.8603879459020853;
    boolean lb1 = true;
    double ld2 = 290.75495697512025;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, ad1, ad2);
}
    ad3 = ad4 - fd0;
    boolean lb3 = false;
    boolean lb4 = false;
    fd1 = ld0 + ld2;
    lb4 = !ab1;

Thought.STACK_COUNTER++;
return ad1;
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
        for(int i1=0; i1<10; i1++){
            fd1 *= -1;
            fb0 = fd0 < fd1;
            boolean lb0 = false;
            double ld1 = 141.6141067381429;
if(ao2 != null){
              ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
            fb1 = ld1 < fd0;
            lb0 = !fb0;
if(ao3 != null){
              fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1);
}
            Thought lo2 = Thought49.getInstance(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
              fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
            fd1 = ld1 - fd0;
            Output.points[3][6] += fd1;
            fb1 = ld1 > fd0;
            lb0 = fb0 && fb1;
            boolean lb3 = true;
if(fo1 != null){
              fo0 = fo1.m4(fd1, ld1, fd0, fd1, lb0, lb3, fb0, fb1);
}
            lb0 = ld1 < fd0;
if(ao1 != null){
              fd1 = ao1.m3();
}
            lb3 = fb0 && fb1;
if(ao3 != null){
              ao2 = ao3.m4(ld1, fd0, fd1, ld1);
}
            lb0 = fd0 < fd1;
            lb3 = fb0 || fb1;
            boolean lb4 = true;
            ld1 *= -1;
if(fo0 != null){
              ao4 = fo0.m4(lb0, lb3, lb4, fb0);
}
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    boolean lb1 = false;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Thought lo2 = Thought25.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo3 = Thought17.getInstance(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
if(ao4 != null){
      ao4.m2();
}
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    Thought lo4 = Thought59.getInstance(ad2, ad3, ad4, fd0);
    Output.points[3][7] += fd1;
    Thought lo5 = Thought48.getInstance(lb1, fb0, fb1, lb0);
    lb1 = !fb0;
    double ld6 = 321.5254219985698;
    fb1 = !lb0;
    lb1 = ld6 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || lb0;
    Output.points[3][8] += fd1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, ao1, ao2, ao3, ld6, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
return ad4;
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
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought80.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought90.getInstance();
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1);
}
    Output.points[4][0] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = ad1 < ad2;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    ad4 = fd0 + fd1;
        Thought lo1 = Thought22.getInstance();
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
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
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fb0 = !fb1;
        lb0 = fb0 || fb1;
    boolean lb1 = false;
        fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    double ld2 = 3.261393535300509;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab1 = ab2 && ab3;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    ab4 = fb0 && fb1;
        Output.points[4][1] -= fd1;
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought57.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    ab2 = ab3 || ab4;
    double ld1 = 323.55433049830316;
    Thought lo2 = Thought78.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    boolean lb3 = false;
    ab2 = fd0 > fd1;
    ld1 = fd0 + fd1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld1 = fd0 + fd1;
    Output.points[4][2] += ld1;
    Thought lo4 = Thought68.getInstance(fd0, fd1, ld1, fd0, fb1, lb3, ab1, ab2);
    Output.points[4][3] -= fd1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    fd0 = fd1 - ad1;
    ad2 *= -1;
    fb0 = fb1 || lb0;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
    lb0 = lb1 || fb0;
    double ld2 = 467.89006994009236;
    fb1 = lb0 || lb1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = true;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb1, lb2, ab1);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    double ld3 = 264.5359269124114;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
    fb1 = lb0 || lb1;
    Output.points[4][4] += fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    lb2 = fd1 > ld3;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ld3;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld3;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m3(fb1, lb0, lb1, lb2);
}
    ad4 = fd0 + fd1;
    ld3 *= -1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought94.getInstance();
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    Output.points[4][5] -= fd0;
if(ao4 != null){
      fb0 = ao4.m2(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought19.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
    fd1 *= -1;
    lb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb1);
}
    double ld3 = 313.15267237893295;
    fb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
return ao2;
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
    Thought lo0 = Thought61.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb1 = true;
    double ld2 = 301.7306618666717;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld2);
}
    lb1 = !fb0;
    Thought lo3 = Thought70.getInstance(fb1, lb1, fb0, fb1);
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2);
}

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
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    Output.points[4][6] += fd1;
    boolean lb1 = false;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb0, lb1, ab1, ab2);
}
    fd1 *= -1;
    boolean lb2 = false;
    fd0 *= -1;
    Thought lo3 = Thought49.getInstance(ao1, ao2, ao3, ao4);
    fd1 = fd0 - fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(ao4 != null){
      fb1 = ao4.m2();
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought48.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    double ld1 = 103.88056998932156;
    double ld2 = 650.8842340461888;
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
    boolean lb3 = true;
    ab3 = ld2 < ad1;
    ab4 = fb0 || fb1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    lb3 = ad3 < ad4;
    fd0 = fd1 - ld1;
    Output.points[4][7] -= ld2;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld2);
}
    fb0 = fb1 && lb3;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
return ao2;
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
    boolean lb0 = false;
    fd0 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    double ld1 = 301.21420926757327;
    fb1 = !lb0;
    double ld2 = 44.966172175838416;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = ld2 < fd0;
    Thought lo3 = Thought10.getInstance(fd1, ld1, ld2, fd0, fb1, lb0, fb0, fb1);
    Output.points[4][8] += fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
        boolean lb4 = false;
    boolean lb5 = false;
    lb0 = lb4 && lb5;
        fb0 = ld1 > ld2;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld1, ld2);
}
    lb0 = lb4 || lb5;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb4);
}
    Output.points[5][0] -= fd0;

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
    fd1 *= -1;
    Thought lo0 = Thought88.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought30.getInstance();
    lb1 = fb0 || fb1;
    lb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb1, fb0, fb1);
}
    fd0 *= -1;
    Thought lo3 = Thought83.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    Output.points[5][1] -= fd0;
if(fo0 != null){
      fo0.m2();
}
    lb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[5][2] -= fd1;
    fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
    lb0 = !lb1;
    Thought lo3 = Thought93.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    lb1 = lb2 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
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
