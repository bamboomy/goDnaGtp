package genetic;
import java.util.ArrayList;
class Thought92 extends Thought{
private static ArrayList<Thought92> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 70.38081884427815;
private double fd1 = 745.3007908713165;
private Thought fo0 = null;
private Thought fo1 = null;
Thought92 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought92 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought92 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought92 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought92 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought92 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought92 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought92 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought92 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought92 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought92 instance = new Thought92 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd1 *= -1;
    lb0 = !fb0;
    fb1 = fd0 < fd1;
    boolean lb1 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    Thought lo2 = Thought304.getInstance();
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought204.getInstance(fb0, fb1, lb0, lb1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[7][1] -= fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 || lb1;
    fb0 = fb1 && lb0;

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
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    ab1 = fd0 > fd1;
    ab2 = fd0 < fd1;
    Thought lo0 = Thought229.getInstance();
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
    Thought lo3 = Thought167.getInstance(fb0, fb1, lb1, lb2);

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
    double ld0 = 781.3308602584984;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought241.getInstance(ld0, ad1, ad2, ad3);
    double ld2 = 10.56078897812604;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ld0 = ld2 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
    fb1 = fb0 || fb1;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    for(int i0=0; i0<10; i0++){
        double ld4 = 668.1863921188169;
        Thought lo5 = Thought381.getInstance(fo0, fo1, fo0, fo1, ld0, ld2, ad1, ad2, fb1, lb3, fb0, fb1);
        ad3 = ad4 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(lb3, fb0, fb1, lb3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = ld4 > ld0;
        ld2 = ad1 + ad2;
        ad3 = ad4 - fd0;
        fd1 = ld4 - ld0;
        ld2 *= -1;
        ad1 = ad2 - ad3;
        ad4 *= -1;
if(fo1 != null){
          fo1.m2(fd0, fd1, ld4, ld0);
}
        boolean lb6 = false;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 > fd1;
    ad1 *= -1;
    Thought lo0 = Thought178.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(fo1 != null){
      ad1 = fo1.m3();
}
    boolean lb2 = true;
    Output.points[7][2] -= ad2;
    ab2 = ad3 < ad4;
    double ld3 = 72.66894843524578;
        boolean lb4 = true;
    ad4 = fd0 - fd1;
    Thought lo5 = Thought352.getInstance(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, ab2, ab3, ab4, fb0);

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
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        fb0 = fb1 && fb0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;

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
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = !fb1;
if(ao3 != null){
      fd1 = ao3.m3(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    double ld1 = 575.602979602411;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, ad1, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo1.m2();
}
        Thought lo2 = Thought180.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
        lb0 = ld1 > ad1;
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
if(ao1 != null){
      fd0 = ao1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld0 = 100.93589948126326;
    Output.points[7][3] -= fd0;
if(ao1 != null){
      fd1 = ao1.m3(ld0, fd0, fd1, ld0);
}
    Output.points[7][4] += fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(ao1 != null){
      ld0 = ao1.m3(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    Thought lo1 = Thought161.getInstance(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);

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
    Thought lo0 = Thought295.getInstance(ab1, ab2, ab3, ab4);
    Thought lo1 = Thought150.getInstance(ao1, ao2, ao3, ao4);
    Thought lo2 = Thought232.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao4.m3(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    ad3 = ad4 - fd0;
    fb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    Output.points[7][5] += ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4();
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
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    lb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 148.65019642592142;
    fd0 = fd1 + ld1;
    fd0 = fd1 - ld1;

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
    fd1 = fd0 + fd1;
    fd0 *= -1;
    double ld0 = 724.4992732679909;
    fd0 *= -1;
    ab1 = ab2 && ab3;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    ab4 = fd0 > fd1;
    Output.points[7][6] -= ld0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
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
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3();
}
    double ld0 = 890.9775308768204;
    Output.points[7][7] -= ad4;
    fb1 = fd0 < fd1;
    fb0 = ld0 < ad1;
    double ld1 = 24.26954313330816;
    double ld2 = 916.378640275616;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, ld1, ld2);
}
        fb0 = !fb1;
        fb0 = !fb1;
        fb0 = ad1 < ad2;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
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
    ad1 *= -1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Output.points[7][8] -= fd1;
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3();
}
    ab4 = ad4 > fd0;
    fb0 = fd1 > ad1;
    fb1 = ad2 > ad3;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb0, lb1, lb2, ab1);
}
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
        Output.points[8][0] += ad3;
        Output.points[8][1] += ad4;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        lb1 = !lb2;
        ab1 = ab2 || ab3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    double ld0 = 265.69499912254236;
    Thought lo1 = Thought56.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    Output.points[8][2] += fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[8][3] += ld0;
    double ld2 = 355.0506114591405;
    fb1 = !fb0;
    ld2 = fd0 + fd1;
        boolean lb3 = true;
if(ao3 != null){
      ld0 = ao3.m3(fb0, fb1, lb3, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ld2 = fd0 - fd1;
    lb3 = fb0 && fb1;
    double ld4 = 77.47394479487697;
    ld0 *= -1;
    lb3 = ld2 > ld4;

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
    double ld0 = 677.2889526300384;
    boolean lb1 = false;
    lb1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought109.getInstance(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
    Thought lo3 = Thought114.getInstance(ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
    Thought lo4 = Thought57.getInstance(ao1, ao2, ao3, ao4, fb1, lb1, fb0, fb1);
    ad1 *= -1;
    lb1 = ad2 > ad3;
    ad4 *= -1;
    Thought lo5 = Thought242.getInstance();

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
    Thought lo0 = Thought190.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    boolean lb1 = true;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, lb1, ab1);
}
        boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld3 = 984.3478375414343;
    ab1 = fd0 > fd1;
    boolean lb4 = true;
    ld3 *= -1;
    double ld5 = 907.5823522807965;
if(fo1 != null){
      fo1.m1(ld5, fd0, fd1, ld3);
}
if(ao1 != null){
      ld5 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld3, ld5);
}
    fd0 = fd1 - ld3;
if(ao1 != null){
      fo1 = ao1.m4(ld5, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb2);
}
    lb4 = ld5 > fd0;
    Output.points[8][4] -= fd1;
    ab1 = ab2 && ab3;
    ld3 *= -1;
if(ao2 != null){
      ab4 = ao2.m2();
}
    double ld6 = 399.63728649894364;
    double ld7 = 793.0134919713931;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad2 = ad3 + ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
    double ld0 = 49.01290285594402;
    ab3 = !ab4;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1);
}
    boolean lb1 = true;
    ad2 = ad3 - ad4;
    ab4 = fb0 && fb1;
    lb1 = ab1 || ab2;
    double ld2 = 360.3933529553342;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
    Output.points[8][5] += ld2;
    Thought lo3 = Thought164.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    if (lb1) {
        boolean lb4 = false;
        lb1 = fd0 < fd1;
if(fo1 != null){
          ab1 = fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
        fb1 = ld0 > ld2;
        boolean lb5 = true;
if(fo0 != null){
          fo0.m1();
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought73.getInstance(fb1, fb0, fb1, fb0);
    Output.points[8][6] += fd0;
    fd1 = fd0 - fd1;
        fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > fd0;
    boolean lb1 = true;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought207.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
if(fo0 != null){
      lb1 = fo0.m2();
}
    fb0 = fb1 || lb1;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb1);
}
    Thought lo4 = Thought107.getInstance(lb3, fb0, fb1, lb1);
    lb3 = fb0 || fb1;
    boolean lb5 = false;
    fd1 = fd0 + fd1;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
if(fo1 != null){
          fo1.m2();
}
        boolean lb0 = true;
        boolean lb1 = true;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
        boolean lb2 = true;
if(fo1 != null){
          lb1 = fo1.m2(lb2, ab1, ab2, ab3);
}
        double ld3 = 153.04882329278323;
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
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    ad2 = ad3 - ad4;
    lb0 = fb0 || fb1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad1 < ad2;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
    ad1 *= -1;
    double ld2 = 914.0611655660376;
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
    double ld3 = 618.4345141305056;
    ad3 = ad4 - fd0;
    boolean lb4 = true;
    lb0 = fd1 < ld2;
if(fo0 != null){
      lb1 = fo0.m2(ld3, ad1, ad2, ad3, lb4, fb0, fb1, lb0);
}
    lb1 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb0);
}
    Thought lo5 = Thought247.getInstance();
    Thought lo6 = Thought385.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, ld3, ad1, lb1, lb4, fb0, fb1);

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
    ad1 = ad2 + ad3;
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    Thought lo0 = Thought175.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    ad1 *= -1;
    double ld1 = 438.86019594210006;
    double ld2 = 751.1123247544687;
    ab1 = !ab2;
        ld2 *= -1;
    Output.points[8][7] -= ad1;
    Output.points[8][8] -= ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[0][0] += ld1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    ld2 = ad1 - ad2;
    double ld3 = 737.4926876147174;
    Output.points[0][1] -= ad2;
    double ld4 = 61.134330537426266;
    ad2 *= -1;
    Output.points[0][2] -= ad3;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
          lb0 = fo1.m2(lb1, fb0, fb1, lb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    lb1 = fb0 && fb1;
    double ld2 = 82.49744542707154;
if(ao1 != null){
          fo1 = ao1.m4(ld2, fd0, fd1, ld2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ld2, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
}
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb0, lb1, lb3, fb0);
}
        fd1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        Thought lo4 = Thought135.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, fb1, lb0, lb1, lb3);
        fb0 = !fb1;
        boolean lb5 = false;
if(ao3 != null){
          ao2 = ao3.m4(lb5, lb0, lb1, lb3);
}
        Output.points[0][3] += fd0;
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fb1 = ao3.m2(fd1, ld2, fd0, fd1);
}
        double ld6 = 322.21369783323445;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    double ld1 = 633.5973590692508;
    if (lb0) {
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
        boolean lb2 = false;
        boolean lb3 = false;
        lb3 = ld1 < ad1;
        lb0 = fb0 && fb1;
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1, lb2, lb3, lb0, fb0);
}
        fb1 = ld1 < ad1;
        ad2 = ad3 + ad4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, lb3, lb0, fb0);
}
        fd0 *= -1;
        fb1 = !lb2;
if(ao3 != null){
          ao2 = ao3.m4();
}
        Thought lo4 = Thought60.getInstance(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2, lb3, lb0, fb0, fb1);
        lb2 = ad3 < ad4;
        lb3 = lb0 || fb0;
        Thought lo5 = Thought389.getInstance(fb1, lb2, lb3, lb0);
        fb0 = !fb1;
        fd0 *= -1;
        double ld6 = 36.74770864640261;
        double ld7 = 11.578121672241247;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ld6);
}
        lb2 = ld7 < ld1;
}
Thought.STACK_COUNTER++;
return ad3;
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
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        ab2 = fd1 > fd0;
        fd1 = fd0 - fd1;
        if (ab3) {
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
              ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
            Thought lo0 = Thought6.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
            boolean lb1 = false;
            fb0 = fd0 < fd1;
            fd0 *= -1;
            Thought lo2 = Thought217.getInstance();
            Output.points[0][4] += fd1;
if(ao1 != null){
              ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
}
            fd0 *= -1;
if(fo1 != null){
              ab3 = fo1.m2(ab4, fb0, fb1, lb1);
}
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
              ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
            double ld3 = 700.1182448694084;
            double ld4 = 111.95507641012462;
if(ao3 != null){
              ao2 = ao3.m4(ld4, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
              ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
            ld4 = fd0 - fd1;
}}
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
    Thought lo0 = Thought209.getInstance();
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
if(ao1 != null){
          ao1.m3(ab2, ab3, ab4, fb0);
}
        fd1 = ad1 - ad2;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb1 = ad3 > ad4;
        ab1 = !ab2;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
          ab3 = ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        boolean lb1 = false;
        ad1 = ad2 + ad3;
        ab3 = ab4 && fb0;
        fb1 = lb1 || ab1;
        ab2 = ad4 < fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        lb1 = ad4 > fd0;
        fd1 = ad1 + ad2;
        ab1 = ad3 > ad4;
        if (ab2) {
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
            lb1 = fd0 < fd1;
            Thought lo2 = Thought393.getInstance();
            ab1 = ab2 && ab3;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    double ld0 = 261.96379246053795;
    ld0 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought91.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    double ld2 = 592.8879646017925;
    fb1 = fd0 > fd1;
    fb0 = ld0 > ld2;
    boolean lb3 = false;
    fd0 = fd1 + ld0;
    ld2 *= -1;
    fd0 *= -1;
    fb0 = fd1 < ld0;
    fb1 = !lb3;
    double ld4 = 773.1828029007471;
    double ld5 = 457.54976684885906;

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
    Thought lo0 = Thought80.getInstance(fo0, fo1, fo0, fo1);
    Output.points[0][5] -= fd1;
        ab2 = !ab3;
    fd0 = fd1 - fd0;
    ab4 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought54.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
    fb1 = !ab1;
    Thought lo2 = Thought350.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
    double ld3 = 204.42859882414325;
    double ld4 = 708.6752956381675;
    boolean lb5 = false;
    fb0 = fb1 || lb5;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = !ab2;
    ab3 = ld3 > ld4;
    boolean lb6 = false;
    fd0 = fd1 + ld3;
    ab3 = ld4 < fd0;
    boolean lb7 = false;
    ab3 = ab4 && fb0;

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
    ad2 *= -1;
    fb0 = ad3 > ad4;
    fd0 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
    Output.points[0][6] -= fd0;
        fd1 = ad1 + ad2;
    fb1 = ad3 > ad4;
    double ld1 = 820.2309720949077;
    Output.points[0][7] -= ad4;
    for(int i0=0; i0<10; i0++){
        double ld2 = 646.4673576927182;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld2, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
        fb1 = ld1 < ad1;
        lb0 = ad2 < ad3;
        ad4 = fd0 - fd1;
        boolean lb3 = false;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought241.getInstance();
    double ld2 = 563.4549920876716;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    boolean lb3 = true;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb4 = true;
if(ao3 != null){
      ao3.m3(fd1, ld2, fd0, fd1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld2, fd0, lb4, fb0, fb1, lb0);
}
    lb3 = lb4 && fb0;
    Thought lo5 = Thought275.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, lb3, lb4);
if(ao3 != null){
      fb0 = ao3.m2();
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, fb1, lb0, lb3, lb4);
}
    double ld6 = 416.03559880731325;
    ld6 = fd0 + fd1;
    ld2 = ld6 - fd0;
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb0, lb3, lb4);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 + ad4;
    double ld0 = 870.0589266708115;
        fb1 = ad4 > fd0;
if(ao1 != null){
      ao1.m2(fd1, ld0, ad1, ad2);
}
    fb0 = ad3 < ad4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
    fb1 = ad2 < ad3;
if(ao1 != null){
      fb0 = ao1.m2(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Output.points[0][8] -= ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    double ld2 = 900.339322506541;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad4 = fd0 - fd1;
    ld0 = ld2 - ad1;
    lb1 = fb0 || fb1;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      ao3.m3(fb1, lb1, fb0, fb1);
}
    boolean lb3 = false;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Output.points[1][0] += ld0;

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
    double ld0 = 56.03492683956669;
    ab1 = !ab2;
    Thought lo1 = Thought38.getInstance(fd0, fd1, ld0, fd0);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
    double ld2 = 339.70985402778183;
if(ao3 != null){
      ld0 = ao3.m3(ab4, fb0, fb1, ab1);
}
    Thought lo3 = Thought274.getInstance(ao4, fo0, fo1, ao1);
    ab2 = ab3 && ab4;
    Thought lo4 = Thought268.getInstance(ld2, fd0, fd1, ld0);
    boolean lb5 = false;
    ld2 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld2);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, ld2, fb0, fb1, lb5, ab1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
        boolean lb6 = false;
        fd0 *= -1;
        fd1 = ld0 - ld2;
        fd0 = fd1 - ld0;
        fb0 = !fb1;
        }
if(ao3 != null){
      ld2 = ao3.m3();
}
    Thought lo7 = Thought313.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld2, lb5, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb5);
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
    ab2 = ad1 > ad2;
    ad3 *= -1;
    Output.points[1][1] += ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
        ab3 = ab4 || fb0;
    Thought lo0 = Thought232.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought162.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
    fb1 = fd0 < fd1;
    Output.points[1][2] -= ad1;
    ab1 = ad2 < ad3;
    Thought lo2 = Thought76.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    double ld3 = 878.9082342956168;
    fb1 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought257.getInstance();
    fb0 = fb1 && ab1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    double ld0 = 226.56550987626477;
    Thought lo1 = Thought90.getInstance(ld0, fd0, fd1, ld0);
    fb0 = fb1 || fb0;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    Thought lo3 = Thought204.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m3();
}
    fb1 = fb0 || fb1;
    fd0 *= -1;
    Output.points[1][3] -= fd1;
    fd0 *= -1;
        boolean lb0 = false;
    double ld1 = 850.1446807181483;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > ld1;
    fd0 = fd1 + ld1;
    fd0 = fd1 + ld1;
    lb0 = !fb0;
    Output.points[1][4] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought104.getInstance(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);

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
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = false;
    lb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    boolean lb4 = false;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, lb2, lb3, lb4);
}
    fd0 = fd1 - fd0;
    Thought lo5 = Thought179.getInstance(fb0, fb1, lb0, lb1);
    Thought lo6 = Thought350.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      lb2 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb3 = fd1 < fd0;
    lb4 = fb0 && fb1;
    lb0 = lb1 && lb2;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    double ld7 = 322.221861800209;
    lb3 = lb4 && fb0;

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
