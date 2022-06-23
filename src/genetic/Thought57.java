package genetic;
import java.util.ArrayList;
class Thought57 extends Thought{
private static ArrayList<Thought57> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 458.45143429062387;
private double fd1 = 999.1645016354463;
private Thought fo0 = null;
private Thought fo1 = null;
Thought57 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought57 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought57 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought57 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought57 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought57 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought57 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought57 instance = new Thought57 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    double ld0 = 336.65768817584336;
    double ld1 = 82.62310203275048;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
    ld1 = fd0 - fd1;
    ld0 = ld1 - fd0;
    Output.points[1][5] += fd1;
    if (fb0) {
if(fo1 != null){
          fo1.m2(fb1, fb0, fb1, fb0);
}
        double ld2 = 668.8608528809845;
        double ld3 = 707.1174359826525;
if(fo0 != null){
          fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(ld2, ld3, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld2, ld3, ld0, fb1, fb0, fb1, fb0);
}
        ld1 = fd0 + fd1;
        Thought lo4 = Thought96.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fb1 = fo1.m2(ld2, ld3, ld0, ld1);
}
        fb0 = !fb1;
        fb0 = fb1 && fb0;
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
    Output.points[1][6] += fd0;
    Thought lo0 = Thought34.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    double ld1 = 165.1400964699142;
    double ld2 = 863.0561295229047;
    ab2 = ld2 > fd0;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
    Output.points[1][7] -= fd1;
    ld1 = ld2 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld1 < ld2;
    ab1 = ab2 && ab3;
    double ld3 = 526.2591957085651;
    Output.points[1][8] -= ld3;
    Thought lo4 = Thought68.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld2, ld3, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = ld1 - ld2;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(ld1, ld2, ld3, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld2, ld3);
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
    fb1 = ad2 > ad3;
    boolean lb0 = false;
    Output.points[2][0] -= ad4;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
    double ld1 = 83.65290379938179;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
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
    ab2 = ad2 > ad3;
    Thought lo0 = Thought30.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[2][1] -= ad1;
    ab2 = ad2 > ad3;
        double ld1 = 347.17868184959354;
    ad3 = ad4 + fd0;
    fd1 = ld1 - ad1;
    ab3 = ad2 > ad3;
    Thought lo2 = Thought37.getInstance(ab4, fb0, fb1, ab1);
if(fo0 != null){
      ad4 = fo0.m3();
}
    Thought lo3 = Thought81.getInstance(fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    boolean lb4 = true;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
    Output.points[2][2] += fd0;
    fb0 = fb1 || lb0;
    Output.points[2][3] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought47.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
        Thought lo2 = Thought77.getInstance();

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
    ad1 *= -1;
    fb0 = ad2 > ad3;
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    double ld0 = 959.5647555757141;
    double ld1 = 821.3100986717087;
    fb1 = fb0 && fb1;
    Thought lo2 = Thought64.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    fb1 = !fb0;
    boolean lb3 = true;
    fb0 = fb1 && lb3;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, lb3, fb0);
}
    double ld4 = 696.6966076916445;
    fb1 = !lb3;
    Thought lo5 = Thought0.getInstance(fd0, fd1, ld0, ld1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ld4, ad1, ad2, ad3);
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
    fd0 = fd1 + fd0;
    ab1 = ab2 && ab3;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
    ab2 = fd0 < fd1;
if(ao4 != null){
      ao4.m1();
}
    ab3 = !ab4;
    double ld0 = 24.76206348189672;
    fb0 = fb1 && ab1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought9.getInstance(ao3, ao4, fo0, fo1, fb1, lb0, lb1, ab1);
    boolean lb3 = true;
if(ao1 != null){
      ao1.m1(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    ad2 *= -1;
    double ld4 = 107.02390308488431;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    lb0 = ad2 > ad3;
    ad4 *= -1;
    boolean lb5 = true;
    lb1 = fd0 > fd1;
    ld4 = ad1 + ad2;
    Output.points[2][4] += ad3;

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
      fd0 = fo1.m3();
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought92.getInstance(fo1, fo0, fo1, fo0);
    fd1 = fd0 + fd1;
    Thought lo1 = Thought14.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    fb0 = fb1 && lb2;
    fb0 = fb1 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;

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
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb0 = ab1 && ab2;
        double ld1 = 373.2159213407116;
        Thought lo2 = Thought84.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
        Output.points[2][5] += fd0;
        lb0 = fd1 < ld1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        boolean lb3 = false;
if(fo1 != null){
          fo1.m1(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
        ab4 = ld1 > fd0;
        boolean lb4 = false;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
    ad1 *= -1;
    fb1 = !fb0;
    fb1 = ad2 > ad3;
    boolean lb0 = true;
    double ld1 = 320.8801744714756;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = fb1 || lb0;
    fd0 *= -1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought12.getInstance(ad1, ad2, ad3, ad4);
    Thought lo1 = Thought25.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought48.getInstance(fo0, fo1, fo0, fo1);
        ab1 = ab2 && ab3;
        ab4 = ad1 < ad2;
        ad3 = ad4 + fd0;
        fd1 = ad1 - ad2;
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
              ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
            fb1 = fd1 < ad1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
            boolean lb3 = true;
if(fo0 != null){
              lb3 = fo0.m2(ab1, ab2, ab3, ab4);
}
            fd1 = ad1 - ad2;
            double ld4 = 709.1800711643306;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 *= -1;
        fb0 = fd1 < fd0;
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought54.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought28.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 && fb0;

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
    double ld0 = 833.742586648341;
    Thought lo1 = Thought0.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3);
    ad4 *= -1;
    boolean lb2 = true;
    Output.points[2][6] -= fd0;
    double ld3 = 840.9319276944528;
    lb2 = fd0 > fd1;
    boolean lb4 = false;
    Output.points[2][7] += ld0;
if(fo1 != null){
      fo0 = fo1.m4(lb4, fb0, fb1, lb2);
}
    lb4 = ld3 > ad1;
if(ao1 != null){
      ao1.m2();
}
    fb0 = fb1 || lb2;
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb4, fb0, fb1, lb2);
}
    lb4 = !fb0;
    ld0 = ld3 - ad1;
    Output.points[2][8] -= ad2;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    double ld2 = 423.36748922861653;
    Output.points[3][0] += ld2;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ld2 *= -1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    double ld1 = 819.6001485670323;
    Output.points[3][1] -= ad4;
    boolean lb2 = true;
    ab4 = fb0 || fb1;
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, lb2, ab1, ab2);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ld1 + ad1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2);
}
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, lb0);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    double ld2 = 374.3886439285824;
    Thought lo3 = Thought39.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, lb1, fb0);
}
    fb1 = fd1 > ld2;
    Output.points[3][2] += fd0;
    fd1 = ld2 + fd0;
    lb0 = fd1 < ld2;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(fd1, ld2, fd0, fd1, lb1, fb0, fb1, lb0);
}
    ld2 = fd0 + fd1;
    lb1 = !fb0;
    ld2 *= -1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    for(int i0=0; i0<10; i0++){
        double ld1 = 766.0447952197266;
        ab2 = ab3 || ab4;
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
        }
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2();
}
    boolean lb4 = true;
    double ld5 = 604.0329299942183;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld5, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld5, fd0, fd1, fb0, fb1, lb0, lb3);
}
    Thought lo6 = Thought84.getInstance(fo1, fo0, fo1, fo0, lb4, ab1, ab2, ab3);

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 113.83146137543089;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
        fb1 = fb0 || fb1;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m1();
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        Output.points[3][3] -= ad4;
        fb0 = fb1 || fb0;
        boolean lb1 = false;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought81.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    double ld1 = 417.55056258751375;
    Thought lo2 = Thought40.getInstance(ab4, fb0, fb1, ab1);
        double ld3 = 767.534752332419;
    Output.points[3][4] -= ld3;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3();
}
    ab2 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld3, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld1 - ld3;
    ad1 = ad2 - ad3;
    Thought lo4 = Thought74.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(ld1, ld3, ad1, ad2);
}
    ab3 = !ab4;
    ad3 = ad4 - fd0;
    fb0 = fb1 && ab1;

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
    fb1 = !fb0;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 329.0873825642514;
    fb1 = fb0 && fb1;
            Output.points[3][5] -= fd0;
    fd1 *= -1;
        Thought lo1 = Thought7.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = !fb0;
    double ld2 = 519.6770143274454;
if(ao1 != null){
      ao1.m2();
}
    ld0 = ld2 - fd0;
    Output.points[3][6] += fd1;
if(ao2 != null){
      ao2.m3(ld0, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ld0 = ao3.m3(ld2, fd0, fd1, ld0);
}
    ld2 = fd0 + fd1;
    Output.points[3][7] -= ld0;
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld2);
}
    boolean lb3 = false;
    fb0 = fd0 < fd1;
    ld0 = ld2 - fd0;

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
    Thought lo0 = Thought70.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m3();
}
    boolean lb1 = true;
    double ld2 = 19.723475568849125;
if(ao2 != null){
          ao2.m3(ld2, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
    fb1 = ad4 > fd0;
    Thought lo3 = Thought63.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2, lb1, fb0, fb1, lb1);
}
    ad3 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld2);
}
    fb1 = lb1 && fb0;
    ad1 *= -1;
    fb1 = ad2 > ad3;
    lb1 = !fb0;
    ad4 = fd0 - fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      fb1 = fo1.m2(lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      ad4 = ao1.m3();
}
    Output.points[3][8] += fd0;
if(ao2 != null){
      ao2.m2(fd1, ld2, ad1, ad2, fb0, fb1, lb1, fb0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    fd0 *= -1;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ab1 = ao2.m2();
}
    Output.points[4][0] -= fd0;
    ab2 = fd1 < fd0;
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao3.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2);
}
    Output.points[4][1] += fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ab4 = ad1 < ad2;
    boolean lb0 = true;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab4 = ad2 < ad3;
    fb0 = fb1 && lb0;
    ab1 = ad4 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
if(ao2 != null){
      ao2.m1();
}
    ad2 *= -1;
    Thought lo1 = Thought96.getInstance(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    ab3 = ad1 > ad2;
    Output.points[4][2] -= ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    Thought lo2 = Thought62.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);

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
    Output.points[4][3] -= fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
    lb0 = lb1 && fb0;

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
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fd1 < fd0;
if(fo0 != null){
      ab1 = fo0.m2();
}
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 || ab4;
        fb0 = fd0 < fd1;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
}
        boolean lb2 = false;
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[4][4] -= fd1;
        lb1 = fd0 < fd1;
        Thought lo4 = Thought99.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        double ld5 = 970.5747635637115;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb3);
}
        double ld6 = 531.942785168399;
        Thought lo7 = Thought63.getInstance(ld5, ld6, fd0, fd1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, ld6, fd0, fd1);
}
if(fo1 != null){
          fo1.m3(lb0, lb1, ab1, ab2);
}
        Output.points[4][5] += ld5;
        ld6 *= -1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo0 = Thought34.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
        ad1 *= -1;
        fb1 = ad2 < ad3;
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
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
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    fd0 = fd1 - ad1;
    Thought lo1 = Thought37.getInstance(ad2, ad3, ad4, fd0);
    boolean lb2 = true;
    lb0 = fd1 < ad1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
    double ld3 = 228.79754504738608;
if(fo1 != null){
      fo1.m1(lb2, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Thought lo4 = Thought49.getInstance();

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
    fd1 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 927.1817901445634;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    fd1 = ld0 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    fb0 = ld0 > fd0;
    fb1 = fd1 > ld0;
    Thought lo2 = Thought17.getInstance();
    lb1 = fb0 || fb1;
    lb1 = fb0 || fb1;
if(fo0 != null){
          fo0.m1(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld3 = 30.56703439677746;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld3, fb1, lb1, fb0, fb1);
}
    Thought lo4 = Thought75.getInstance(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
    double ld5 = 308.8347042548495;
if(ao3 != null){
      ao3.m3(ld5, fd0, fd1, ld0);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
          fd1 = ao1.m3(fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    fb1 = !fb0;
    fb1 = ad2 > ad3;
    fb0 = ad4 > fd0;
    fb1 = !fb0;
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = ad3 < ad4;
    boolean lb0 = true;
    fd0 = fd1 - ad1;
    if (lb0) {
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
        fd1 *= -1;
        boolean lb1 = true;
        ad1 = ad2 + ad3;
        boolean lb2 = true;
        lb0 = fb0 || fb1;
        double ld3 = 727.1168581860596;
        double ld4 = 702.1083692701578;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb1, lb2, lb0, fb0);
}
        Thought lo5 = Thought98.getInstance(fo1, ao1, ao2, ao3, fb1, lb1, lb2, lb0);
        Output.points[4][6] += fd1;
if(fo0 != null){
          ao4 = fo0.m4(ld3, ld4, ad1, ad2);
}
if(fo1 != null){
          ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld3);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 93.62439780980003;
    Thought lo1 = Thought46.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(ao2 != null){
      ab1 = ao2.m2();
}
    ab2 = !ab3;
if(ao3 != null){
      ab4 = ao3.m2(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    double ld2 = 65.14675414133085;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo3 = Thought93.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, ld2, fd0, ab3, ab4, fb0, fb1);
    ab1 = fd1 < ld0;
    boolean lb4 = true;
    ld2 = fd0 + fd1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb4;
    boolean lb5 = true;
    boolean lb6 = true;
    lb5 = ld0 < ld2;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ld2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought87.getInstance(ab2, ab3, ab4, fb0);
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad3 *= -1;
    ab2 = ab3 && ab4;
    Thought lo2 = Thought10.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, lb1, ab1);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
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
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    double ld0 = 648.4819306159334;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fd0 = fd1 - ld0;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought18.getInstance(fb0, fb1, fb0, fb1);
    Thought lo2 = Thought86.getInstance();
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, fd0, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb3, fb0);
}
    fb1 = !lb3;
    fb0 = ld0 < fd0;
    fd1 = ld0 - fd0;
    Thought lo4 = Thought22.getInstance(fo0, fo1, fo0, fo1, fb1, lb3, fb0, fb1);
    Thought lo5 = Thought80.getInstance(fd1, ld0, fd0, fd1);
    Output.points[4][7] += ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(lb3, fb0, fb1, lb3);
}
    double ld6 = 8.624607897902486;
    ld6 = fd0 - fd1;
    boolean lb7 = true;

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
if(fo1 != null){
      fo1.m1();
}
    Thought lo0 = Thought36.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
    lb1 = fd0 > fd1;
        fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Output.points[4][8] -= fd0;
    fd1 *= -1;
    Output.points[5][0] -= fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = true;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought3.getInstance();
    fd1 *= -1;
    Thought lo2 = Thought22.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    lb3 = fd0 > fd1;
    fb0 = !fb1;
    lb0 = fd0 > fd1;
    lb3 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb3, fb0);
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
