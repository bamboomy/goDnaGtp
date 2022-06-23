package genetic;
import java.util.ArrayList;
class Thought33 extends Thought{
private static ArrayList<Thought33> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 998.6090453876208;
private double fd1 = 682.3228782156846;
private Thought fo0 = null;
private Thought fo1 = null;
Thought33 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought33 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought33 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought33 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought33 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought33 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought33 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought33 instance = new Thought33 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < fd0;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 *= -1;

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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    double ld0 = 667.9379278598299;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
    fb0 = fb1 && ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ld0 = fd0 + fd1;
    ab3 = ab4 && fb0;
    ld0 = fd0 + fd1;
    Thought lo1 = Thought6.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
    boolean lb2 = true;
    ab3 = fd0 < fd1;

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
    ad1 = ad2 - ad3;
    boolean lb1 = true;
    double ld2 = 704.3113712345015;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    Output.points[0][0] -= ld2;
    lb0 = lb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      ld2 = fo1.m3(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2();
}
    lb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
    lb0 = ad4 > fd0;
    double ld3 = 228.46206319087133;
    if (lb1) {
        boolean lb4 = false;
        fd0 *= -1;
        lb1 = !fb0;
        fd1 *= -1;
        fb1 = !lb4;
if(fo1 != null){
          ld2 = fo1.m3(ld3, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
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
    boolean lb0 = false;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = ad3 < ad4;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    Thought lo2 = Thought7.getInstance(ab2, ab3, ab4, fb0);
    boolean lb3 = false;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    for(int i0=0; i0<10; i0++){
        lb0 = ad2 > ad3;
        ad4 = fd0 + fd1;
        lb1 = ad1 < ad2;
        ad3 = ad4 - fd0;
        fd1 *= -1;
        ad1 = ad2 + ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb3, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        ad2 = ad3 + ad4;
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
    fb0 = fd0 > fd1;
    fb1 = !fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    double ld1 = 114.6895754601683;
if(ao1 != null){
      ao1.m2(ld1, fd0, fd1, ld1);
}
    fd0 *= -1;

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
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3();
}
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;
    Output.points[0][1] += ad4;
    fd0 *= -1;
    fb0 = fd1 < ad1;
if(ao4 != null){
      ao4.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought34.getInstance(fo0, fo1, ao1, ao2);
    fb1 = fb0 || fb1;
    fd1 *= -1;
    ad1 *= -1;
    Thought lo1 = Thought70.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
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
    ab1 = fd1 < fd0;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    double ld0 = 285.51531059793126;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    ld0 = fd0 + fd1;
    Output.points[0][2] -= ld0;
    fb1 = lb1 && ab1;
    fd0 = fd1 - ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    ab2 = ab3 || ab4;
    double ld2 = 252.74036164800665;
if(ao3 != null){
      ao3.m1(fb0, fb1, lb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
          ao4 = fo0.m4();
}
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, ld2, ab4, fb0, fb1, lb1);
}
    lb3 = ab1 || ab2;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought63.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    Output.points[0][3] += fd0;
    fd1 = ad1 - ad2;
        Thought lo2 = Thought95.getInstance(ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo3 = Thought14.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
    boolean lb4 = false;
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
        Output.points[0][4] -= ad1;
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb4);
}
        ab1 = ab2 || ab3;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
        ad1 = ad2 - ad3;
if(fo1 != null){
          fo1.m3(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
          lb4 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          fd1 = ao2.m3();
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    lb1 = fb0 && fb1;
    lb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb2 = false;
    lb1 = lb2 && fb0;
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb3 = true;
    lb0 = lb1 && lb2;
    Output.points[0][5] -= fd0;
    boolean lb4 = false;
if(fo1 != null){
      lb3 = fo1.m2(lb4, fb0, fb1, lb0);
}

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
    boolean lb0 = false;
    boolean lb1 = true;
    lb0 = !lb1;
    Output.points[0][6] -= fd1;
    ab1 = fd0 < fd1;
    boolean lb2 = true;
    ab1 = ab2 && ab3;
    Output.points[0][7] -= fd0;
    boolean lb3 = false;
    Output.points[0][8] -= fd1;
    boolean lb4 = true;
    double ld5 = 39.96525198029276;
    if (ab2) {
        ld5 = fd0 - fd1;
        ld5 *= -1;
        ab3 = fd0 > fd1;
        boolean lb6 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
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
    boolean lb0 = true;
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = !fb0;
    Thought lo1 = Thought57.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    ad3 = ad4 + fd0;
    fb0 = fd1 < ad1;
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = ad1 < ad2;
        if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
        fd1 = ad1 + ad2;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    Thought lo2 = Thought58.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    double ld3 = 959.5200490540567;
    lb0 = lb1 && ab1;
    Output.points[1][0] -= ld3;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought32.getInstance();
    boolean lb5 = true;
    lb0 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, lb1, lb5, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought41.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = fd0 > fd1;
    fb1 = lb1 || fb0;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    double ld2 = 272.8561574298591;
    boolean lb3 = false;
    lb1 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2, fb0, fb1, lb1, lb3);
}
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb3);
}
    Thought lo4 = Thought14.getInstance(fd0, fd1, ld2, fd0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought51.getInstance();
if(ao3 != null){
      ao3.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld1 = 407.5298733062937;
    boolean lb2 = true;
    boolean lb3 = true;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb2);
}
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld1);
}
    lb3 = ad1 > ad2;

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
    boolean lb0 = true;
    Output.points[1][1] += fd1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      lb0 = fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought37.getInstance(fd0, fd1, fd0, fd1);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought35.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    ab1 = ab2 && ab3;
    fd0 = fd1 - ad1;
    ab4 = fb0 && fb1;
    boolean lb1 = true;
        double ld2 = 101.33992325695077;
if(ao1 != null){
      fo1 = ao1.m4(lb1, ab1, ab2, ab3);
}
if(ao2 != null){
          ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
}
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
}
    double ld3 = 191.21211142814326;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
    double ld4 = 407.59463053578565;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought86.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
        Thought lo2 = Thought26.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
        fd1 *= -1;
        lb1 = !fb0;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    Thought lo1 = Thought47.getInstance(fd1, fd0, fd1, fd0);
    ab4 = fb0 || fb1;
    boolean lb2 = true;
    lb0 = fd1 < fd0;
    lb2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought82.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fd1 = fo0.m3();
}
    double ld4 = 214.64841953883104;
    ld4 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld4, fd0, fb1, lb0, lb2, ab1);
}
    boolean lb5 = false;
    fd1 *= -1;
    if (ab1) {
        ab2 = ab3 || ab4;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        ld4 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, fb1, lb0, lb2, lb5);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad2 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    lb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;

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
      fo0 = fo1.m4();
}
    Output.points[1][2] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    if (fb1) {
        ab1 = ab2 || ab3;
        ab4 = fb0 && fb1;
        ab1 = !ab2;
        ab3 = ad1 < ad2;
        Output.points[1][3] -= ad3;
        ab4 = ad4 > fd0;
        double ld0 = 88.66173306714914;
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
    double ld0 = 242.5158634664378;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    fb0 = fd0 < fd1;
    if (fb1) {
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        ld0 = fd0 + fd1;
if(ao1 != null){
          fo1 = ao1.m4(ld0, fd0, fd1, ld0);
}
        } else {
        boolean lb1 = false;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(ao2 != null){
          ao1 = ao2.m4(lb1, fb0, fb1, lb1);
}
if(ao3 != null){
                  fb0 = ao3.m2();
}
        fb1 = lb1 || fb0;
        fb1 = ld0 < fd0;
        lb1 = fb0 && fb1;
        double ld2 = 771.4897706322878;
        fd0 *= -1;
        lb1 = fd1 < ld2;
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
    Output.points[1][4] -= ad1;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    fb0 = fd1 > ad1;
    Output.points[1][5] += ad2;
    Output.points[1][6] += ad3;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought71.getInstance(ao3, ao4, fo0, fo1);
        fb1 = ad4 < fd0;
        fb0 = fb1 && fb0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        Thought lo1 = Thought52.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
        fd0 = fd1 + ad1;
        ad2 *= -1;
if(fo0 != null){
          ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
        ad1 *= -1;
if(fo1 != null){
          ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        fb0 = ad1 < ad2;
if(ao3 != null){
          ad3 = ao3.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        fb1 = ad2 < ad3;
        fb0 = ad4 > fd0;
        fb1 = fb0 || fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    double ld0 = 239.56244325545285;
if(ao2 != null){
      ld0 = ao2.m3(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < ld0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Thought lo1 = Thought78.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Thought lo2 = Thought11.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    Thought lo3 = Thought57.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
    double ld4 = 930.5952137149558;
    ab2 = ld0 > ld4;
    boolean lb5 = false;
if(ao2 != null){
      ao2.m2(fd0, fd1, ld0, ld4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld4);
}
    double ld6 = 982.2768699449578;
if(ao3 != null){
      ao3.m3(ab2, ab3, ab4, fb0);
}
    boolean lb7 = false;
    ld6 *= -1;
if(ao4 != null){
      fd0 = ao4.m3();
}
if(fo0 != null){
      fo0.m2(fd1, ld0, ld4, ld6, fb0, fb1, lb5, lb7);
}
    fd0 = fd1 - ld0;

Thought.STACK_COUNTER++;
return ld4;
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
    ab1 = ad1 < ad2;
    boolean lb0 = true;
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought62.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
    fd0 = fd1 - ad1;
    lb1 = ad2 < ad3;
    double ld3 = 281.08502952769;
    ab1 = ad3 > ad4;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, ad1);
}
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m1();
}

Thought.STACK_COUNTER++;
return ld3;
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
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 415.9807045562837;
    ld0 = fd0 + fd1;
    Output.points[1][7] -= ld0;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    Thought lo1 = Thought2.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
    ld0 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[1][8] += ld0;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld2 = 569.3944793791915;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;

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
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    lb0 = fd1 > fd0;
    fd1 *= -1;
    ab1 = ab2 && ab3;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    Thought lo2 = Thought39.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Output.points[2][0] -= fd1;
    fb1 = lb0 && lb1;
    lb3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < ad1;
        fb0 = ad2 > ad3;
        ad4 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        Output.points[2][1] += fd0;
        fb1 = fb0 && fb1;
        fb0 = fd1 > ad1;
        double ld0 = 728.0779303851598;
        fb1 = ad1 < ad2;
        Output.points[2][2] -= ad3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
        fb0 = fb1 || fb0;
        Thought lo1 = Thought2.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
        boolean lb2 = false;
        fb0 = fb1 && lb2;
        boolean lb3 = false;
if(fo0 != null){
          lb3 = fo0.m2(fb0, fb1, lb2, lb3);
}
        boolean lb4 = true;
        for(int i1=0; i1<10; i1++){
            boolean lb5 = false;
            boolean lb6 = true;
if(fo0 != null){
              fo1 = fo0.m4();
}
            lb2 = !lb3;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ld0, ad1, lb4, fb0, fb1, lb5);
}
            }
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
    ab2 = ab3 && ab4;
    Output.points[2][3] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab2 = ab3 || ab4;
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    Output.points[2][4] -= ad1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !ab1;

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
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought92.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought92.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m1(fb1, fb0, fb1, fb0);
}
    Output.points[2][5] += fd0;
if(fo0 != null){
      fo0.m1();
}
    Output.points[2][6] += fd1;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = fb1 || lb2;
    fd1 *= -1;
    fd0 *= -1;
    fb0 = !fb1;
    lb2 = fd1 > fd0;
    double ld3 = 322.18511815423176;
    fd0 = fd1 + ld3;
    fb0 = fb1 || lb2;

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
    ad2 = ad3 + ad4;
    Output.points[2][7] -= fd0;
    fd1 = ad1 - ad2;
    Thought lo0 = Thought70.getInstance(ao1, ao2, ao3, ao4);
    Output.points[2][8] += ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought49.getInstance(ad3, ad4, fd0, fd1);
    Output.points[3][0] += ad1;
    ad2 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[3][1] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Output.points[3][2] -= fd1;
    ab1 = fd0 > fd1;
    fd0 *= -1;
    double ld0 = 871.5078324995121;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo1 = Thought39.getInstance(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
    double ld2 = 58.59327662242785;
    fb1 = fd0 > fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ld2 = fd0 + fd1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    Output.points[3][3] += ld0;
        Thought lo3 = Thought90.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    Thought lo4 = Thought7.getInstance(ld2, fd0, fd1, ld0);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 < ad1;
    ab3 = !ab4;
    if (fb0) {
        fb1 = ab1 || ab2;
        ab3 = ad2 > ad3;
if(ao1 != null){
          fo1 = ao1.m4(ab4, fb0, fb1, ab1);
}
        ad4 *= -1;
        Thought lo0 = Thought7.getInstance();
if(ao2 != null){
          fd0 = ao2.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        Output.points[3][4] -= ad4;
        fb1 = fd0 < fd1;
        ad1 = ad2 + ad3;
        ab1 = ad4 > fd0;
        double ld1 = 375.62604562801533;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fd0 *= -1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        boolean lb2 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb2, ab1);
}
        Thought lo3 = Thought26.getInstance(ad3, ad4, fd0, fd1);
        Output.points[3][5] += ld1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        ab2 = !ab3;
        ab4 = fb0 && fb1;
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
    double ld0 = 688.0605777801081;
    fb0 = !fb1;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    Output.points[3][6] += fd1;
    fb0 = ld0 < fd0;
    fb1 = fb0 || fb1;
    fd1 = ld0 + fd0;
    fb0 = fd1 < ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
if(fo1 != null){
          fo1.m2();
}
    double ld1 = 54.475015194947;
    ld1 = fd0 - fd1;
        fb1 = fb0 || fb1;
    boolean lb2 = false;
    Thought lo3 = Thought63.getInstance(ld0, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
    ld0 = ld1 + fd0;
    double ld4 = 474.14658345595035;

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld0 = 316.2341734838901;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[3][7] -= fd1;
    double ld1 = 324.15654539816734;
    fb0 = ld0 < ld1;
    double ld2 = 770.7353540357774;
    fb1 = fb0 || fb1;
    Output.points[3][8] += ld2;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    ld0 = ld1 + ld2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1);
}
    fb1 = ld2 > fd0;
    Output.points[4][0] -= fd1;
    fb0 = !fb1;
    fb0 = ld0 > ld1;

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
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought31.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    double ld1 = 909.216682982428;
if(fo0 != null){
      fo0.m1();
}
    Thought lo2 = Thought73.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
    boolean lb3 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, lb3, fb0, fb1, lb3);
}
    ld1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}
    fd1 *= -1;
    ld1 = fd0 + fd1;
    Thought lo4 = Thought18.getInstance(ld1, fd0, fd1, ld1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fb0 = fo1.m2();
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
