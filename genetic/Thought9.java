package genetic;
import java.util.ArrayList;
class Thought9 extends Thought{
private static ArrayList<Thought9> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 56.046256519493454;
private double fd1 = 763.4473235948576;
private Thought fo0 = null;
private Thought fo1 = null;
Thought9 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought9 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought9 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought9 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought9 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought9 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought9 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought9 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought9 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought9 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought9 instance = new Thought9 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 309.67393754480787;
    if (fb1) {
        Thought lo1 = Thought3.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Thought lo2 = Thought82.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
        fb0 = fb1 || fb0;
        fb1 = fb0 && fb1;
        ld0 = fd0 - fd1;
        ld0 = fd0 + fd1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
        fd0 = fd1 + ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
        boolean lb3 = false;
if(fo1 != null){
          fo1.m2(fb0, fb1, lb3, fb0);
}
        fb1 = fd1 < ld0;
        lb3 = fd0 > fd1;
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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 755.4130850144387;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ld0;
    Thought lo2 = Thought58.getInstance(fd0, fd1, ld0, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    ab4 = fd0 > fd1;
    ld0 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fd0 = fo0.m3(lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    fd1 *= -1;
if(fo1 != null){
      lb1 = fo1.m2();
}
    ld0 *= -1;
    Output.points[2][2] += fd0;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
        Output.points[2][3] -= fd1;
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
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 578.3142281825317;
    boolean lb2 = true;
    double ld3 = 212.52026654264122;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb2);
}
    double ld4 = 128.40859544102577;
    double ld5 = 620.6883084220661;
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb6, fb0, fb1, lb0);
}
    Thought lo7 = Thought28.getInstance(ld1, ld3, ld4, ld5);
    boolean lb8 = false;
    boolean lb9 = false;

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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
    boolean lb0 = false;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, ab1);
}
    ab2 = ad1 > ad2;
    ab3 = ad3 > ad4;
    fd0 = fd1 - ad1;
    ad2 *= -1;
    ab4 = ad3 < ad4;
    boolean lb1 = false;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3();
}
    ab4 = fb0 || fb1;
    lb0 = lb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !lb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
        ad1 = ad2 - ad3;
    lb1 = ab1 || ab2;
    double ld2 = 351.538218289674;
    double ld3 = 498.1334894462817;
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
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
if(ao2 != null){
      ao2.m2();
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought48.getInstance(fd1, fd0, fd1, fd0);
    boolean lb2 = true;

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
    double ld0 = 131.95205402062612;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought94.getInstance(fb1, fb0, fb1, fb0);
        fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fd0 *= -1;
    Thought lo2 = Thought6.getInstance();
    fd1 = ld0 - ad1;
    ad2 = ad3 - ad4;

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
    ab2 = fd1 > fd0;
    ab3 = !ab4;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 - fd1;
    double ld0 = 140.5639484393142;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    ab2 = ld0 > fd0;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    fd1 = ld0 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1);
}
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
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
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        ab2 = ad4 < fd0;
if(ao1 != null){
          fd1 = ao1.m3(ab3, ab4, fb0, fb1);
}
        Thought lo0 = Thought91.getInstance();
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        double ld1 = 869.6549862530513;
        fb0 = fb1 && ab1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
        fb1 = ad1 < ad2;
        boolean lb2 = false;
        Thought lo3 = Thought2.getInstance(ao4, fo0, fo1, ao1, lb2, ab1, ab2, ab3);
        ad3 = ad4 - fd0;
if(ao2 != null){
          ao2.m2(fd1, ld1, ad1, ad2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        ab4 = ld1 < ad1;
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
    Thought lo0 = Thought31.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo1 = Thought96.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    Thought lo2 = Thought63.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    double ld4 = 465.58828799954046;
    fb0 = fb1 && lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0);
}
    Output.points[2][4] -= fd1;
    Output.points[2][5] += ld4;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb3, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(ld4, fd0, fd1, ld4, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0, fb0, fb1, lb3, fb0);
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
    Thought lo0 = Thought73.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = fd0 < fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2();
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[2][6] += ad2;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    Output.points[2][7] -= ad1;
    lb0 = fb0 && fb1;
    if (lb0) {
        boolean lb1 = false;
        double ld2 = 47.42560731327939;
        lb0 = !fb0;
        boolean lb3 = false;
        boolean lb4 = false;
        } else {
        ad2 *= -1;
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo0.m2(lb0, fb0, fb1, lb0);
}
        ad1 = ad2 + ad3;
        fb0 = ad4 < fd0;
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
    Thought lo0 = Thought16.getInstance();
    if (ab1) {
        boolean lb1 = false;
if(fo1 != null){
          fo1.m1(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        double ld2 = 225.78116326028325;
        boolean lb3 = true;
        fd0 = fd1 - ld2;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
}
        } else {
        fb1 = ad1 > ad2;
        double ld4 = 203.3333580378688;
        ab1 = ad2 > ad3;
        ad4 *= -1;
        Output.points[2][8] += fd0;
        ab2 = fd1 < ld4;
        Thought lo5 = Thought10.getInstance(ad1, ad2, ad3, ad4);
        if (ab3) {
            ab4 = fb0 || fb1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ad1);
}
            ab1 = ab2 || ab3;
if(fo1 != null){
              ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo1 != null){
              fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fb1 = !lb0;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
    if (fb1) {
        lb0 = fd1 > fd0;
        boolean lb1 = false;
        lb0 = fb0 || fb1;
        fd1 *= -1;
if(fo0 != null){
          lb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
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
    Thought lo0 = Thought9.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    Output.points[3][0] -= ad3;
    ad4 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
        ad1 = ad2 + ad3;
        double ld2 = 531.3120987803082;
        Thought lo3 = Thought99.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3);
}
        boolean lb4 = false;
if(ao4 != null){
          ad4 = ao4.m3(fb0, fb1, lb4, lb1);
}
        Thought lo5 = Thought7.getInstance();
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld2, ad1, ad2, ad3, fb1, lb4, lb1, fb0);
}
        Thought lo6 = Thought38.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2, fb1, lb4, lb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb4, lb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, ab1);
}
        fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    double ld0 = 194.16788304581922;
    ab4 = fb0 && fb1;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
        ab4 = !fb0;
        fd0 = fd1 - ld0;
        fb1 = fd0 < fd1;
        boolean lb1 = false;
        Thought lo2 = Thought61.getInstance(lb1, ab1, ab2, ab3);
        ab4 = ld0 < fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
if(ao1 != null){
      ao1.m3();
}
    ad3 = ad4 + fd0;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab2 = ao2.m2(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
        ab4 = ad4 > fd0;
        Thought lo0 = Thought1.getInstance(ao3, ao4, fo0, fo1);
        fd1 = ad1 - ad2;
        Output.points[3][1] -= ad3;
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
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    fd0 *= -1;
    Output.points[3][2] -= fd1;
    Thought lo0 = Thought18.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Output.points[3][3] -= fd1;

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
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    ab4 = fb0 || fb1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        } else {
        fb1 = !lb0;
        boolean lb1 = true;
        lb0 = !ab1;
        ab2 = !ab3;
        ab4 = fd1 < fd0;
        boolean lb2 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 377.65476588415214;
    fb0 = ld0 > ad1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fd1 = ld0 + ad1;
    double ld1 = 242.14656937223822;
    boolean lb2 = false;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fb0 = fb1 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1);
}
    Thought lo3 = Thought57.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb2, fb0, fb1);
}
    Thought lo4 = Thought30.getInstance();

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
    ab1 = !ab2;
    double ld0 = 828.276164553873;
    double ld1 = 963.358282472718;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = ab4 && fb0;
    ld0 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb0, fb1, lb2, ab1);
}
    ab2 = !ab3;
    boolean lb3 = true;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
    double ld4 = 301.01860039275545;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fb1 = ao4.m2(fb0, fb1, fb0, fb1);
}
    Output.points[3][4] -= fd0;
    Thought lo0 = Thought74.getInstance();
        fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought58.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    double ld2 = 766.4169479673809;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld2, fd0);
}
    Thought lo3 = Thought72.getInstance(fo1, ao1, ao2, ao3, fd1, ld2, fd0, fd1);
    double ld4 = 85.85522821368518;
    boolean lb5 = true;
    double ld6 = 828.3248182695745;
    boolean lb7 = false;
    ld2 = ld4 + ld6;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(lb7, fb0, fb1, lb5);
}
if(fo1 != null){
      fo1.m1();
}
    fd1 = ld2 + ld4;
if(ao2 != null){
      ao1 = ao2.m4(ld6, fd0, fd1, ld2, lb7, fb0, fb1, lb5);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = ad1 < ad2;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought90.getInstance(ao1, ao2, ao3, ao4);
    Output.points[3][5] -= ad3;
    ad4 = fd0 + fd1;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
    boolean lb3 = false;
    lb2 = !lb3;
    fb0 = !fb1;
    double ld4 = 54.56997220325288;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, lb2, lb3, fb0, fb1);
}
    lb0 = !lb2;
if(ao3 != null){
      lb3 = ao3.m2(ld4, ad1, ad2, ad3);
}
    fb0 = fb1 && lb0;
    if (lb2) {
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld4);
}
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
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(ao1 != null){
      ao1.m2(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Output.points[3][6] += fd0;
    ab1 = !ab2;
if(ao2 != null){
      ab3 = ao2.m2();
}
if(ao3 != null){
      ao3.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    double ld0 = 724.7250736284743;
    ld0 *= -1;
    double ld1 = 286.0950884567322;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = ld1 < fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought20.getInstance(fd1, ld0, ld1, fd0);
    fd1 = ld0 - ld1;
    ab4 = fd0 > fd1;
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb3);
}
if(ao3 != null){
      ab1 = ao3.m2();
}
    ld0 = ld1 - fd0;
    if (ab2) {
        ab3 = ab4 && fb0;
if(fo0 != null){
          ao4 = fo0.m4(fd1, ld0, ld1, fd0, fb1, lb3, ab1, ab2);
}
        ab3 = !ab4;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    Output.points[3][7] += ad4;
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    lb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
    double ld1 = 229.56045754047645;
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld1;
        boolean lb2 = false;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
        fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    double ld0 = 817.5426932526292;
    Output.points[3][8] += fd0;
    Output.points[4][0] += fd1;
    if (fb0) {
        fb1 = fb0 && fb1;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > ld0;
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
    ab2 = fd1 < fd0;
    ab3 = ab4 && fb0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    Output.points[4][1] -= fd1;
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = fd0 < fd1;
    ab4 = fd0 < fd1;
    if (fb0) {
        Output.points[4][2] += fd0;
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
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb1 = fo1.m2();
}
    double ld0 = 1000.8385100678815;
    boolean lb1 = false;
    lb1 = ad4 < fd0;
    boolean lb2 = true;
    Output.points[4][3] += fd1;
    double ld3 = 56.58727256934579;
    boolean lb4 = false;
if(fo1 != null){
          fo0 = fo1.m4(ld0, ld3, ad1, ad2, lb2, lb4, fb0, fb1);
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
    ad1 = ad2 + ad3;
    Thought lo0 = Thought92.getInstance(fo1, fo0, fo1, fo0);
    Output.points[4][4] -= ad4;
    Output.points[4][5] += fd0;
    ab1 = fd1 < ad1;
    ad2 = ad3 - ad4;
    double ld1 = 398.942953030987;
        ab2 = !ab3;
    ab4 = fb0 && fb1;
        ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    Thought lo2 = Thought93.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld1, ad1);
}
    boolean lb3 = false;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    double ld4 = 351.1674206356851;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    double ld5 = 184.84287368104984;
    ld1 = ld4 - ld5;
    double ld6 = 605.857489845814;

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
      fb0 = ao2.m2();
}
    fb1 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 739.1563110160157;
        double ld1 = 793.0002029995782;
    fb0 = ld1 > fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ld1, fd0);
}
    fb1 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > fd0;
    double ld2 = 523.0982649450768;
    fd0 *= -1;
        fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m1();
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ld1, ld2, lb3, fb0, fb1, lb3);
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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd1 < ad1;
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought28.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    double ld2 = 715.3892148921086;
    lb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao2.m1(lb1, fb0, fb1, lb1);
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
    boolean lb0 = true;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
          ab4 = ao4.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought99.getInstance(fo0, fo1, ao1, ao2);
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, lb2, ab1, ab2);
}
    fd0 *= -1;
    ab3 = !ab4;
    Output.points[4][6] += fd1;
    Thought lo3 = Thought66.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb2);
    Thought lo4 = Thought49.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;

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
    ab2 = ad2 > ad3;
    ab3 = ab4 || fb0;
    Output.points[4][7] += ad4;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ad2 = ao2.m3(fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
if(ao3 != null){
      ad3 = ao3.m3();
}
    ab3 = ad4 > fd0;
    double ld1 = 637.0735683852339;
    ab4 = !fb0;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld1, ad1, ad2, fb1, lb0, ab1, ab2);
}
    if (ab3) {
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
        ld1 = ad1 - ad2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb0;
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3);
}
        ad4 *= -1;
        fd0 = fd1 + ld1;
if(fo0 != null){
          ad1 = fo0.m3(ab1, ab2, ab3, ab4);
}
        ad2 = ad3 + ad4;
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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(lb0, lb1, fb0, fb1);
}
    Output.points[4][8] -= fd0;
    lb0 = fd1 < fd0;
    double ld2 = 409.0252686524392;
    Output.points[5][0] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
    Thought lo3 = Thought87.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
    Output.points[5][1] += fd1;
    Thought lo0 = Thought27.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2();
}
    fb0 = !fb1;
    Output.points[5][2] -= fd1;
    fd0 *= -1;
    Thought lo1 = Thought82.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;

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
