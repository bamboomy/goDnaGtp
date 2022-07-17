package genetic;
import java.util.ArrayList;
class Thought90 extends Thought{
private static ArrayList<Thought90> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 783.8580640456374;
private double fd1 = 708.9763714342804;
private Thought fo0 = null;
private Thought fo1 = null;
Thought90 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought90 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought90 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought90 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought90 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought90 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought90 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought90 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought90 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought274.getInstance(fo0, fo1, fo0, fo1);
    Output.points[0][1] -= fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    Output.points[0][2] += fd1;
    fd0 = fd1 - fd0;

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
    ab2 = !ab3;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        ab4 = fd1 < fd0;
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb0 = false;
        ab4 = fd1 < fd0;
        fd1 *= -1;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
        fb1 = fd0 > fd1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        lb0 = fd1 > fd0;
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    Output.points[0][3] += ad3;
    boolean lb0 = false;
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
    fb1 = lb0 || fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, lb1);
}
    ad4 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3);
}
    lb2 = fb0 || fb1;
    ad4 *= -1;

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
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    ad3 *= -1;
if(fo0 != null){
      fo0.m2();
}
    Thought lo0 = Thought259.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = ad3 < ad4;
    ab3 = fd0 > fd1;
    boolean lb1 = false;

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
    Thought lo0 = Thought108.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        for(int i0=0; i0<10; i0++){
            Thought lo1 = Thought382.getInstance(fb1, fb0, fb1, fb0);
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
            fb1 = fb0 || fb1;
            fb0 = fd0 > fd1;
            Output.points[0][4] -= fd0;
}}
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
    fb1 = ad2 > ad3;
    ad4 *= -1;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought115.getInstance(ad1, ad2, ad3, ad4);
    double ld1 = 247.91516696127792;
    Output.points[0][5] += ad4;
    fd0 = fd1 - ld1;
    double ld2 = 522.9825118426381;
    fb1 = fb0 || fb1;
    Output.points[0][6] += ld2;
    fb0 = fb1 || fb0;
    fb1 = ad1 < ad2;
    fb0 = ad3 > ad4;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, ld2, ad1);
}
    ad2 *= -1;
    ad3 *= -1;
    fb1 = ad4 > fd0;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, ld2, ad1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld3 = 398.23369512113055;
    double ld4 = 209.2117463231464;
    double ld5 = 300.5037179449867;
    fb1 = ad3 < ad4;
    Output.points[0][7] -= fd0;

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
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    double ld0 = 421.498445098182;
    Thought lo1 = Thought18.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
    double ld2 = 243.189912800366;
    double ld3 = 12.096489800755625;
    ld3 = fd0 + fd1;
    double ld4 = 57.142711506570684;
    boolean lb5 = true;
    ab4 = ld0 < ld2;
    fb0 = ld3 < ld4;
    double ld6 = 962.7158858860506;
    fb1 = lb5 || ab1;
    double ld7 = 239.00728718244778;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld6, ld7, fd0, fd1);
}
    ab2 = ld0 > ld2;
    ab3 = ab4 || fb0;

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
    ad1 *= -1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
    fb0 = ad2 < ad3;
    Thought lo0 = Thought230.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab1 = ab2 || ab3;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(lb1, ab1, ab2, ab3);
}
            ab4 = ad2 > ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
        fd0 = fd1 + fd0;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 && fb0;
    fd1 = fd0 + fd1;
        boolean lb1 = false;
    fb0 = !fb1;
    lb0 = lb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    if (lb0) {
        boolean lb2 = true;
        Thought lo3 = Thought324.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
        boolean lb4 = true;
        lb2 = lb4 || lb0;
        Output.points[0][8] -= fd0;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = !ab4;
    double ld0 = 312.0167291625609;
    fb0 = !fb1;
    ld0 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][0] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    double ld1 = 616.6277412225324;
    Thought lo2 = Thought177.getInstance(ad4, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought322.getInstance(lb0, fb0, fb1, lb0);
    fb0 = fd0 < fd1;

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
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ad2 *= -1;
    lb0 = ab1 && ab2;
    ab3 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fd0, fd1, ad1, ad2);
}
        double ld1 = 932.6960812419492;
        Output.points[1][1] += ad2;
        ad3 *= -1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
        fd0 = fd1 + ld1;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        Thought lo2 = Thought136.getInstance();
        boolean lb3 = false;
        fb0 = ad1 < ad2;
        Thought lo4 = Thought202.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb3, lb0, ab1);
if(fo0 != null){
          ld1 = fo0.m3(ab2, ab3, ab4, fb0);
}
        double ld5 = 888.1442440077408;
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
    boolean lb0 = false;
    if (fb0) {
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
        double ld1 = 447.35678471581565;
        double ld2 = 641.8473273233416;
        Output.points[1][2] += ld2;
        fb1 = fd0 > fd1;
        Thought lo3 = Thought163.getInstance(ld1, ld2, fd0, fd1);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ld2, fd0, fd1);
}
        double ld4 = 926.4108920653462;
        ld1 = ld2 - ld4;
        Thought lo5 = Thought248.getInstance(fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
        fb1 = ld4 > fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    ad4 *= -1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = ad4 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao4.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought94.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought28.getInstance();
    lb0 = ad1 > ad2;
    fb0 = fb1 || lb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][3] -= fd0;
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
    double ld0 = 336.47651982132555;
if(ao1 != null){
      ao1.m3(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    Output.points[1][4] -= ld0;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
    ab1 = ab2 || ab3;
    fd1 *= -1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    ab4 = fb0 || fb1;
    ab1 = !ab2;
    fd0 *= -1;
if(ao2 != null){
      ab3 = ao2.m2(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
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
    ab1 = ab2 || ab3;
    double ld0 = 136.71790214041522;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ld0 = ad1 + ad2;
    boolean lb1 = true;
if(ao1 != null){
      ad3 = ao1.m3();
}
    if (ab1) {
        boolean lb2 = true;
        ab1 = ab2 || ab3;
        ab4 = ad4 < fd0;
        double ld3 = 212.46347546026328;
        double ld4 = 135.01161591501014;
        ad4 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld3, ld4, ld0, ad1, fb0, fb1, lb2, lb1);
}
        ab1 = ad2 > ad3;
        ab2 = ad4 < fd0;
        Output.points[1][5] -= fd1;
        } else {
        ab4 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(lb1, ab1, ab2, ab3);
}
        boolean lb5 = false;
if(ao4 != null){
          ab3 = ao4.m2(fo0, fo1, ao1, ao2);
}
        ld0 = ad1 - ad2;
        Output.points[1][6] -= ad3;
        if (ab4) {
if(ao3 != null){
              ao3.m2(ad4, fd0, fd1, ld0);
}
            fb0 = fb1 && lb5;
}}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    if (lb0) {
        Thought lo1 = Thought98.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo0.m1(fb1, lb0, fb0, fb1);
}
        lb0 = fd0 < fd1;
        } else if (fb0) {
        fb1 = fd0 < fd1;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Output.points[1][7] += fd0;
        fb0 = fb1 && lb0;
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0);
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    boolean lb0 = false;
    ab4 = fd0 < fd1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
    Output.points[1][8] += fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    Output.points[2][0] -= fd0;
    fd1 *= -1;
    lb0 = lb1 && ab1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m1();
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    boolean lb2 = false;
    lb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    lb2 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, lb1, lb2, lb3);
}
    ad3 = ad4 - fd0;
    fb0 = fd1 < ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    Thought lo4 = Thought174.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);

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
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 *= -1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
    double ld0 = 252.60569558949695;
    ab2 = !ab3;
    boolean lb1 = false;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      ld0 = fo1.m3(ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought101.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
    lb1 = !ab1;
    ab2 = ab3 || ab4;
    Output.points[2][1] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    Thought lo3 = Thought180.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fb1 = ld0 > ad1;
    lb1 = ab1 || ab2;
    ab3 = ab4 || fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = true;
    fd0 *= -1;
    lb0 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
        fd0 *= -1;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    Output.points[2][2] -= fd1;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
        boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    lb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, lb1, lb2, lb3);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    lb2 = fd1 < fd0;
if(ao1 != null){
      ao1.m3(lb3, fb0, fb1, lb0);
}
    Output.points[2][3] -= fd1;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 && fb1;
    Output.points[2][4] += ad2;
    Thought lo0 = Thought92.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
    boolean lb1 = false;
    ad4 = fd0 - fd1;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || lb1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao4.m1(fb1, lb1, fb0, fb1);
}
    fd0 *= -1;
    lb1 = fb0 || fb1;
    boolean lb2 = true;
    Thought lo3 = Thought185.getInstance(fo0, fo1, ao1, ao2);
    Thought lo4 = Thought81.getInstance(fd1, ad1, ad2, ad3);

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 502.0617707307925;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab4 = fb0 && fb1;
    double ld1 = 927.9644593380933;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    double ld2 = 991.8453059567169;
    ld1 = ld2 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
    fd1 = ld0 - ld1;
    ab3 = ld2 > fd0;
    ab4 = fd1 > ld0;
    fb0 = !fb1;
    ld1 = ld2 - fd0;
    Output.points[2][5] += fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(ld1, ld2, fd0, fd1);
}
    ab1 = ld0 < ld1;
    ld2 = fd0 - fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    ab3 = !ab4;
    Output.points[2][6] += ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    boolean lb0 = true;
    ad3 = ad4 - fd0;
    boolean lb1 = false;
if(ao1 != null){
      ab3 = ao1.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    lb0 = lb1 || ab1;
    ab2 = ab3 || ab4;
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3();
}
    double ld2 = 11.969948761705002;
    fb0 = fd0 < fd1;
    boolean lb3 = true;

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
    Output.points[2][7] -= fd1;
    Thought lo0 = Thought321.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    boolean lb1 = true;
        double ld2 = 585.0813156234383;
    ld2 = fd0 - fd1;
    fb0 = !fb1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    lb1 = !lb3;
    fd0 = fd1 + ld2;
    Thought lo4 = Thought322.getInstance(fd0, fd1, ld2, fd0, fb0, fb1, lb1, lb3);
    boolean lb5 = false;
    fd1 = ld2 - fd0;
    for(int i0=0; i0<10; i0++){
        lb5 = !fb0;
        double ld6 = 445.2556497825693;
        fd0 = fd1 - ld6;
        ld2 *= -1;
        boolean lb7 = false;
        fb0 = fd0 < fd1;
        boolean lb8 = false;
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
    Thought lo0 = Thought2.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, ab1, ab2, ab3);
}
    Output.points[2][8] -= fd1;
    Thought lo1 = Thought118.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[3][0] -= fd0;
    double ld2 = 653.2517422053647;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    double ld3 = 300.90600088632846;
        boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = ld2 < ld3;
    boolean lb5 = false;
    Thought lo6 = Thought169.getInstance();

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
    Thought lo0 = Thought142.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        boolean lb1 = true;
        Thought lo2 = Thought283.getInstance(lb1, fb0, fb1, lb1);
        fd0 *= -1;
        fb0 = fd1 < ad1;
        for(int i1=0; i1<10; i1++){
            fb1 = ad2 < ad3;
            lb1 = !fb0;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            if (fb1) {
                lb1 = fb0 && fb1;
                boolean lb3 = true;
                lb3 = !lb1;
                boolean lb4 = false;
                lb1 = !fb0;
                double ld5 = 510.6406707767263;
                fb1 = ad3 > ad4;
                lb3 = fd0 < fd1;
                Output.points[3][1] -= ld5;
}}}
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
    Thought lo0 = Thought293.getInstance(ad2, ad3, ad4, fd0);
    Thought lo1 = Thought324.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    Thought lo2 = Thought96.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    boolean lb3 = true;
    double ld4 = 585.4568160176736;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, ab1);
}
    Output.points[3][2] -= ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      ab2 = fo1.m2();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
        fb0 = !fb1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    double ld1 = 149.26530951926267;
    lb0 = ld1 < fd0;
    fb0 = fb1 && lb0;
    double ld2 = 698.3817904858755;
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = fd0 > fd1;
    Output.points[3][3] += ld1;
if(ao2 != null){
      ao1 = ao2.m4(ld2, fd0, fd1, ld1);
}
    fb1 = lb0 || fb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld1);
}
    boolean lb3 = false;

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
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    Output.points[3][4] -= fd1;
    fb0 = fb1 || lb0;
if(ao2 != null){
      fb0 = ao2.m2();
}
    if (fb1) {
        Thought lo1 = Thought132.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
if(ao1 != null){
          ao1.m3(fb0, fb1, lb0, fb0);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
        fb1 = lb0 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        double ld2 = 363.1708135987949;
        Output.points[3][5] += ld2;
        fb1 = ad1 < ad2;
        boolean lb3 = false;
        lb3 = ad3 > ad4;
        } else {
        fb0 = fd1 < ad1;
        boolean lb4 = true;
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought268.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
    Thought lo1 = Thought28.getInstance();
    double ld2 = 734.4210470711722;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    double ld3 = 359.7914246894657;
    fd0 *= -1;
    boolean lb4 = true;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo5 = Thought181.getInstance(ld2, ld3, fd0, fd1);
if(ao3 != null){
      lb4 = ao3.m2(ao4, fo0, fo1, ao1, ld2, ld3, fd0, fd1);
}
    Thought lo6 = Thought242.getInstance(ld2, ld3, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = ld2 < ld3;
    fb1 = fd0 < fd1;
    lb4 = ld2 < ld3;

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
    ab2 = ad1 < ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m1();
}
        if (ab4) {
        fb0 = fb1 && ab1;
if(ao1 != null){
          ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        Output.points[3][6] -= ad3;
        fb1 = ab1 || ab2;
        ab3 = ad4 < fd0;
        fd1 = ad1 + ad2;
        double ld0 = 74.99530131166546;
        ab4 = ad2 < ad3;
        double ld1 = 780.0230370624336;
        boolean lb2 = true;
        boolean lb3 = false;
        boolean lb4 = false;
if(fo1 != null){
          ad3 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
        ad4 = fd0 - fd1;
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
    fd0 *= -1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2();
}
        fd1 = fd0 - fd1;
    fb1 = !fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        boolean lb1 = true;

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
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    fb0 = !fb1;
    double ld1 = 297.57972509274094;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    Output.points[3][7] -= fd0;
    boolean lb2 = false;
    double ld3 = 506.523088717969;
    lb2 = fd0 > fd1;
    ld1 = ld3 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo4 = Thought13.getInstance(fo0, fo1, fo0, fo1, ld1, ld3, fd0, fd1, fb0, fb1, lb0, lb2);
    ld1 = ld3 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb5 = false;

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
            boolean lb0 = false;
    Thought lo1 = Thought306.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    boolean lb3 = false;
    boolean lb4 = true;
    boolean lb5 = true;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb2, lb3, lb4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb0);
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
