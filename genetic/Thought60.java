package genetic;
import java.util.ArrayList;
class Thought60 extends Thought{
private static ArrayList<Thought60> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 467.14015590901784;
private double fd1 = 984.2607592677725;
private Thought fo0 = null;
private Thought fo1 = null;
Thought60 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought60 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought60 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought60 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought60 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought60 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought60 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought60 instance = new Thought60 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    Output.points[4][8] += fd0;
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    fd0 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;

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
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld0 = 589.2726782725438;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[5][0] -= fd0;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[5][1] += ld0;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought69.getInstance(fb1, fb0, fb1, fb0);
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    Output.points[5][2] -= ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 || fb1;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    lb1 = ad2 < ad3;
        double ld3 = 567.801537563134;
    lb2 = ad3 > ad4;
    fd0 *= -1;
    fb0 = fb1 && lb1;
    lb2 = fd1 > ld3;
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb1 && lb2;
    Output.points[5][3] += ad3;
    ad4 = fd0 - fd1;
    ld3 = ad1 + ad2;

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
    boolean lb0 = true;
    double ld1 = 332.2672799693149;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1);
}
if(fo0 != null){
      fo0.m1(lb0, lb2, lb3, ab1);
}
    Output.points[5][4] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
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
    Thought lo0 = Thought85.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    Output.points[5][5] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
          fd0 = ao4.m3(lb1, fb0, fb1, lb1);
}
    Output.points[5][6] -= fd1;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    double ld3 = 668.3715870296211;
    for(int i0=0; i0<10; i0++){
        double ld4 = 392.8896654085671;
        for(int i1=0; i1<10; i1++){
            lb2 = ld3 > fd0;
            fb0 = fb1 && lb1;
            Thought lo5 = Thought61.getInstance(ao4, fo0, fo1, ao1, fd1, ld4, ld3, fd0, lb2, fb0, fb1, lb1);
            lb2 = fb0 && fb1;
            fd1 = ld4 + ld3;
            lb1 = fd0 > fd1;
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
    fb1 = ad1 > ad2;
    Thought lo0 = Thought58.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    Output.points[5][7] += ad3;
    if (fb0) {
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          ao1.m2();
}
        ad3 = ad4 + fd0;
        fd1 = ad1 - ad2;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
        } else {
        fb1 = ad1 < ad2;
        Output.points[5][8] += ad3;
        fb0 = ad4 < fd0;
if(ao4 != null){
          fd1 = ao4.m3(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        boolean lb1 = true;
        lb1 = fb0 && fb1;
        lb1 = ad1 < ad2;
        boolean lb2 = false;
if(fo0 != null){
          ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
        lb2 = ad2 < ad3;
        fb0 = fb1 || lb1;
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
    Thought lo0 = Thought1.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    fd1 = fd0 - fd1;
    Output.points[6][0] -= fd0;
    ab3 = !ab4;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ab4 = fd0 < fd1;
    Output.points[6][1] += fd0;
    fd1 = fd0 - fd1;
    double ld1 = 724.6441584848675;
    boolean lb2 = true;
    ab4 = fb0 || fb1;
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(ld1, fd0, fd1, ld1, lb2, lb3, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0);
}
if(ao4 != null){
      ao4.m2(ab3, ab4, fb0, fb1);
}
    fd1 = ld1 + fd0;
    fd1 *= -1;

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
    Thought lo0 = Thought31.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    ab1 = fd0 > fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    double ld1 = 320.8573071170602;
    Output.points[6][2] -= ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    double ld2 = 379.2020747753667;
    boolean lb3 = false;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ad4 = fd0 - fd1;
    Thought lo4 = Thought16.getInstance(ld1, ld2, ad1, ad2, ab2, ab3, ab4, fb0);
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = !lb3;
    boolean lb5 = true;
if(fo0 != null){
      lb5 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ld1 = fo1.m3(ab1, ab2, ab3, ab4);
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
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
    Thought lo1 = Thought14.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    for(int i0=0; i0<10; i0++){
        Output.points[6][3] += fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
        boolean lb2 = false;
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, lb3);
}
    double ld4 = 201.72890269781948;
    double ld5 = 508.0042541776487;
    fb0 = ld4 > ld5;
    boolean lb6 = true;
    fd0 *= -1;
    if (fb0) {
        fb1 = fd1 > ld4;
        double ld7 = 850.3765378992265;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 802.0629764289224;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    lb2 = !ab1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb3 = false;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][4] -= ad1;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
    Output.points[6][5] -= ad2;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fb0 || fb1;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        double ld1 = 388.5125824936933;
        Output.points[6][6] -= ad2;
        ad3 *= -1;
        Output.points[6][7] += ad4;
        Thought lo2 = Thought77.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
}
        Thought lo3 = Thought79.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
        Output.points[6][8] -= ld1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
        Thought lo4 = Thought44.getInstance(fo1, fo0, fo1, fo0);
        fb0 = !fb1;
if(fo1 != null){
          lb0 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
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
    double ld0 = 460.2653384088371;
    Output.points[7][0] += ad1;
    double ld1 = 581.2017165718071;
    ab1 = !ab2;
if(fo0 != null){
      ad1 = fo0.m3();
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, ld0, ld1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[7][1] -= fd1;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd1 *= -1;
    boolean lb1 = true;
    if (fb0) {
        Output.points[7][2] += fd0;
        fd1 = fd0 + fd1;
        fb1 = lb0 || lb1;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
        fb0 = fb1 || lb0;
        fd0 *= -1;
        lb1 = fb0 || fb1;
        fd1 *= -1;
        Thought lo2 = Thought89.getInstance();
        boolean lb3 = false;
        Output.points[7][3] += fd0;
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
        fd0 *= -1;
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
    fb1 = fb0 || fb1;
    fb0 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      fd0 = ao4.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 = ad1 - ad2;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought92.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
    ad1 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    double ld0 = 246.492680719022;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    Thought lo1 = Thought67.getInstance(ld0, fd0, fd1, ld0);
if(ao4 != null){
      ao4.m1(ab1, ab2, ab3, ab4);
}
    Output.points[7][4] -= fd0;
    fd1 = ld0 - fd0;
    double ld2 = 312.9293053786737;
    fb0 = fb1 || ab1;
    double ld3 = 432.37573467350774;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo0 != null){
      ld3 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 > ad3;
        boolean lb0 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
    double ld2 = 693.2520133152485;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ld2, ad1, ad2, ad3);
}
    double ld4 = 289.6963858413234;
    fb1 = ad3 > ad4;
    boolean lb5 = true;

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
    fb1 = fd1 < fd0;
    double ld0 = 715.5849325259718;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb1 = false;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    lb1 = ld0 > fd0;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    double ld2 = 562.6318424741605;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb1 = !fb0;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = true;
    fd0 *= -1;
    ab2 = fd1 < fd0;
    fd1 *= -1;
    Output.points[7][5] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    Thought lo1 = Thought61.getInstance(lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought41.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && lb0;
    Output.points[7][6] += fd1;
    ad1 = ad2 + ad3;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    boolean lb3 = true;

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
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    if (ab1) {
        ab2 = ad2 < ad3;
        ab3 = ad4 > fd0;
        ab4 = fb0 && fb1;
        Output.points[7][7] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab1 = ad1 < ad2;
        ab2 = ad3 < ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
        ad3 = ad4 + fd0;
        ab1 = ab2 && ab3;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
        ab4 = !fb0;
        boolean lb0 = true;
        double ld1 = 531.6903953668292;
        fb0 = !fb1;
        ad4 *= -1;
        Thought lo2 = Thought24.getInstance(lb0, ab1, ab2, ab3);
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
        fb0 = ad2 > ad3;
        ad4 *= -1;
        fb1 = lb0 || ab1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
        fb1 = ad2 < ad3;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][8] -= fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    double ld0 = 106.24853351653421;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo1 = Thought91.getInstance(fd0, fd1, ld0, fd0);
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        fd1 = ld0 - fd0;
if(ao3 != null){
          ao3.m2(fb0, fb1, lb2, fb0);
}
        fb1 = lb2 || fb0;
        boolean lb3 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    if (fb0) {
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
        Output.points[8][0] += ad1;
        boolean lb1 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Output.points[8][1] -= ad2;
        fb0 = fb1 || lb0;
if(ao1 != null){
          ao1.m2(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        double ld2 = 633.0786661774246;
        lb1 = fb0 || fb1;
        Thought lo3 = Thought54.getInstance(ld2, ad1, ad2, ad3);
        ad4 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(lb0, lb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, ad1, ad2, ad3);
}
        Output.points[8][2] -= ad4;
        lb0 = fd0 > fd1;
        ld2 *= -1;
        boolean lb4 = true;
        ad1 = ad2 - ad3;
        lb1 = ad4 > fd0;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2();
}
    ab3 = !ab4;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(ao3 != null){
      fd0 = ao3.m3(ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    boolean lb3 = false;
    lb1 = fd0 < fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb2, lb3, ab1, ab2);
}
    ab3 = fd1 > fd0;
    boolean lb4 = true;
    ab3 = !ab4;
    boolean lb5 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, lb2, lb3, lb4, lb5);
}
    boolean lb6 = true;
if(ao2 != null){
      ao2.m2();
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
    for(int i0=0; i0<10; i0++){
        ab1 = ad2 > ad3;
        Thought lo0 = Thought98.getInstance(ad4, fd0, fd1, ad1);
        ad2 = ad3 - ad4;
        fd0 = fd1 + ad1;
        boolean lb1 = true;
if(ao2 != null){
          ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
        fb0 = fd1 > ad1;
        fb1 = !lb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fd1 < ad1;
        fb1 = !lb1;
        Thought lo2 = Thought78.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
        ad2 *= -1;
        fb0 = fb1 && lb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        double ld3 = 604.1882746065224;
        fb0 = ld3 > ad1;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][3] -= fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        fb1 = fd1 < fd0;
        fd1 *= -1;
        Output.points[8][4] += fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        fb1 = fd0 < fd1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb0 = fd1 < fd0;
        Output.points[8][5] -= fd1;
        fd0 = fd1 - fd0;
        boolean lb0 = false;
        fb0 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo0.m3();
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought89.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    ab2 = fd1 < fd0;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fd1 = fd0 - fd1;
    Output.points[8][6] += fd0;

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
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;
    double ld0 = 599.0999380715142;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ld0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = ad1 > ad2;
        fb1 = !lb1;
        Output.points[8][7] -= ad3;
        lb2 = ad4 < fd0;
        Thought lo3 = Thought7.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, lb1, lb2);
        boolean lb4 = true;
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb4, lb1);
}
        lb2 = ad3 > ad4;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd1 = ld0 + ad1;
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
    double ld0 = 998.591889265822;
    ld0 = ad1 - ad2;
if(fo0 != null){
      ab2 = fo0.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3);
}
    ab1 = ab2 && ab3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    Output.points[8][8] += ld0;
    ad1 *= -1;
    ab1 = ad2 > ad3;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
    ab3 = !ab4;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(ad4, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
        ad1 *= -1;
        boolean lb2 = true;
        boolean lb3 = true;
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
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao4 != null){
      ao4.m2(fb0, fb1, fb0, fb1);
}
    Output.points[0][0] -= fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    boolean lb2 = false;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, lb1, lb2, fb0, fb1);
}
    fd0 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fd1 = fd0 - fd1;
    lb0 = !lb1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
        lb1 = fd1 > fd0;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought1.getInstance();
    boolean lb4 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
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
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 && fb0;
    fb1 = ad4 < fd0;
    fd1 = ad1 + ad2;
    fb0 = fb1 || fb0;
    ad3 *= -1;
    Thought lo0 = Thought71.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    double ld2 = 538.505740343796;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad1 = ad2 - ad3;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought43.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    ab2 = fd1 > fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Output.points[0][1] -= fd0;
    Thought lo1 = Thought85.getInstance(ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
    double ld2 = 574.859336241649;
    double ld3 = 129.81607236591046;
    ab4 = ld3 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ld3, fd0);
}

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
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    Output.points[0][2] -= ad2;
    ab3 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Output.points[0][3] += fd1;
    Output.points[0][4] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 241.40192145630226;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
    Output.points[0][5] += ad1;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought59.getInstance(fo0, fo1, ao1, ao2);
    double ld2 = 966.6076607273774;
    boolean lb3 = true;
    fd0 = fd1 + ld0;
    ld2 = ad1 - ad2;
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb3);
}
if(ao4 != null){
      ab1 = ao4.m2();
}
if(fo0 != null){
      ld2 = fo0.m3(ad1, ad2, ad3, ad4);
}
    Thought lo4 = Thought16.getInstance(ab2, ab3, ab4, fb0);

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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
    Output.points[0][6] += fd1;
    boolean lb0 = true;
    Output.points[0][7] += fd0;
    lb0 = !fb0;
    fb1 = fd1 < fd0;
    Output.points[0][8] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought35.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);

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
    fd1 = fd0 + fd1;
    double ld0 = 122.28209591004511;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    Thought lo2 = Thought48.getInstance();
    ld0 = fd0 - fd1;
    lb1 = ld0 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    fb0 = fd0 < fd1;
    fb1 = ld0 < fd0;
    double ld3 = 67.01200769001892;
if(fo0 != null){
          fd0 = fo0.m3(lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld3, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld3, fd0, fd1, fb1, lb1, fb0, fb1);
}
    ld0 *= -1;
    Thought lo4 = Thought35.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
    ld3 = fd0 + fd1;
    Output.points[1][0] += ld0;
    fb0 = ld3 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld3, fd0, fd1, fb1, lb1, fb0, fb1);
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought98.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;

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
