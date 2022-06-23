package genetic;
import java.util.ArrayList;
class Thought69 extends Thought{
private static ArrayList<Thought69> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 747.6061047038826;
private double fd1 = 686.5588924625398;
private Thought fo0 = null;
private Thought fo1 = null;
Thought69 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought69 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought69 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought69 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought69 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought69 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought69 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought69 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought69 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought69 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought69 instance = new Thought69 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    boolean lb0 = true;
    Thought lo1 = Thought57.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        lb0 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        double ld2 = 813.1812108964695;
        boolean lb3 = true;
        boolean lb4 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
        fd0 = fd1 - ld2;
        }
if(fo0 != null){
      fd1 = fo0.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    boolean lb5 = false;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb5, fb0);
}
    boolean lb6 = true;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || ab1;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought4.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        Thought lo2 = Thought13.getInstance(ab2, ab3, ab4, fb0);
        fb1 = fd1 > fd0;
        double ld3 = 556.3486145348762;
        Thought lo4 = Thought17.getInstance();
        fd0 = fd1 + ld3;
        fd0 = fd1 + ld3;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld3, fd0, fd1, lb0, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        Output.points[6][7] += ld3;
        Thought lo5 = Thought84.getInstance(fo1, fo0, fo1, fo0);
        Thought lo6 = Thought92.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb0, ab1, ab2, ab3);
        boolean lb7 = false;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought56.getInstance(ad1, ad2, ad3, ad4);
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
if(fo0 != null){
          ad3 = fo0.m3();
}
if(fo1 != null){
          fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
        ad2 = ad3 - ad4;
        fb1 = !lb1;
        fb0 = fd0 < fd1;
        Thought lo2 = Thought21.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
        Thought lo3 = Thought53.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
if(fo1 != null){
          fo1.m2(fd0, fd1, ad1, ad2);
}
        fb1 = !lb1;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        fb0 = ad2 > ad3;
        Thought lo4 = Thought35.getInstance(fb1, lb1, fb0, fb1);
        ad4 *= -1;
        }
if(fo1 != null){
      fb0 = fo1.m2();
}
    double ld5 = 925.0420998980745;
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ld5, fb0, fb1, fb0, fb1);
}
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo7 = Thought63.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb6, fb0, fb1, lb6);
    fb0 = fd0 < fd1;
    double ld8 = 131.88324374416177;

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
    Output.points[6][8] -= ad1;
    double ld0 = 537.8843292491396;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo1.m1(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3();
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
    Thought lo0 = Thought67.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 569.1887662541359;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
    ld1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
    Output.points[7][0] -= fd0;
    Output.points[7][1] += fd1;
if(ao1 != null){
      ao1.m3(fb0, fb1, lb2, fb0);
}
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ld1, fd0, fd1, ld1, fb1, lb2, fb0, fb1);
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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought72.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought45.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      fb0 = ao2.m2(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fb1 = fd0 < fd1;
    ad1 *= -1;
    double ld2 = 756.7562929983675;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
    Output.points[7][2] -= fd1;
    ld2 *= -1;
    fb0 = fb1 || fb0;
    boolean lb3 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ld2 = fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo4 = Thought57.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ad1, fb1, lb3, fb0, fb1);
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb3, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld2, ad1, ad2);
}
    lb3 = !fb0;
    boolean lb5 = false;
    ad3 *= -1;

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
    Thought lo0 = Thought99.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd1 = ao2.m3();
}
        double ld1 = 320.68976810458554;
        double ld2 = 521.5521520420642;
        boolean lb3 = false;
if(ao3 != null){
          ld1 = ao3.m3(ld2, fd0, fd1, ld1, ab4, fb0, fb1, lb3);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        ab1 = ld2 < fd0;
        boolean lb4 = false;
        boolean lb5 = false;
        lb5 = fd1 < ld1;
        Thought lo6 = Thought82.getInstance(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
        fb0 = !fb1;
        Thought lo7 = Thought87.getInstance(ao1, ao2, ao3, ao4, lb3, lb4, lb5, ab1);
        ab2 = ab3 || ab4;
if(fo1 != null){
          fo0 = fo1.m4(ld2, fd0, fd1, ld1);
}
        Output.points[7][3] -= ld2;
        Thought lo8 = Thought0.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ld2);
        fd0 = fd1 - ld1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb3, lb4);
}
        lb5 = ab1 && ab2;
        ld2 *= -1;
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
    Thought lo1 = Thought46.getInstance();
    Thought lo2 = Thought87.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fb0 = fd0 < fd1;
    ad1 *= -1;
        double ld3 = 898.6090178285467;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
    fd0 = fd1 + ld3;
    ad1 = ad2 - ad3;
    ab3 = !ab4;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, ab1);
}
        boolean lb4 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld3, ad1);
}
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld3;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    double ld5 = 646.366827625771;
    Thought lo6 = Thought71.getInstance(ab4, fb0, fb1, lb0);
    double ld7 = 220.5107841963093;

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
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3();
}
    Output.points[7][4] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb1 = fd1 > fd0;
        boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought21.getInstance(fd1, fd0, fd1, fd0);
    boolean lb3 = true;
    lb0 = lb1 && lb3;
    Output.points[7][5] += fd1;
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return lb4;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought67.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    lb1 = ab1 && ab2;
    boolean lb3 = false;
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
    Output.points[7][6] += fd0;
    Thought lo4 = Thought44.getInstance(fo0, fo1, fo0, fo1);

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
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought30.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
    ad3 *= -1;
if(fo1 != null){
      lb2 = fo1.m2();
}
    fb0 = ad4 < fd0;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb1, lb0, lb2, fb0);
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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[7][7] -= ad2;
    boolean lb0 = false;
    ab1 = !ab2;
    ad3 *= -1;
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought71.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      fd1 = fo0.m3();
}
    lb0 = lb1 && ab1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought49.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
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
    fb0 = fb1 || fb0;
    double ld0 = 981.8052505039782;
        double ld1 = 203.34563681764553;
if(ao2 != null){
      ld1 = ao2.m3(fd0, fd1, ld0, ld1);
}
    fb1 = fd0 < fd1;
    Thought lo2 = Thought40.getInstance(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1);
    ld0 = ld1 - fd0;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fd1 = ao1.m3(fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
    fb1 = fb0 || fb1;
    ld1 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao3 != null){
      ld0 = ao3.m3(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb3;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb3, fb0);
}
        Output.points[7][8] += ld1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, ld1);
}
        boolean lb4 = true;
        fb0 = fb1 || lb4;
        Thought lo5 = Thought60.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1);
        boolean lb6 = true;
        boolean lb7 = true;
if(ao2 != null){
          fd0 = ao2.m3(lb6, lb7, lb3, fb0);
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
if(ao3 != null){
      fb0 = ao3.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought80.getInstance(ao4, fo0, fo1, ao1);
    double ld1 = 855.6853438772553;
    boolean lb2 = false;
    Output.points[8][0] -= ad1;
    boolean lb3 = false;
    lb3 = fb0 || fb1;
    lb2 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1, lb3, fb0, fb1, lb2);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, lb3, fb0, fb1, lb2);
}
    ad2 = ad3 + ad4;
if(ao1 != null){
      ao1.m2(fd0, fd1, ld1, ad1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(lb3, fb0, fb1, lb2);
}
    boolean lb4 = false;
    lb3 = lb4 && fb0;
if(ao4 != null){
      ao3 = ao4.m4();
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
    fd0 = fd1 - fd0;
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    double ld0 = 192.93048341113968;
    ld0 *= -1;
    boolean lb1 = true;
    fb0 = !fb1;
    lb1 = fd0 < fd1;
    Output.points[8][1] += ld0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    ab4 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0);
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
    ab1 = ad2 < ad3;
    boolean lb0 = false;
    ab1 = ab2 && ab3;
    Thought lo1 = Thought17.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
        ab4 = ad2 > ad3;
    fb0 = ad4 < fd0;
    fb1 = lb0 && ab1;
    fd1 = ad1 - ad2;
    ab2 = ad3 < ad4;
    Output.points[8][2] += fd0;
    Thought lo2 = Thought3.getInstance(ab3, ab4, fb0, fb1);
    lb0 = !ab1;
    fd1 *= -1;
        ab2 = !ab3;
    ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld3 = 132.35806405445558;
    ab4 = fb0 && fb1;
    boolean lb4 = false;
    lb0 = lb4 || ab1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
        Output.points[8][3] -= fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    fd0 *= -1;
    fb0 = fb1 && lb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = lb0 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought19.getInstance();
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    double ld3 = 541.9212798049646;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb2 = ld3 < fd0;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought63.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
        Output.points[8][4] += fd1;
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    double ld2 = 768.623185665262;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    ab4 = fb0 && fb1;
    double ld3 = 420.82884319913074;
    boolean lb4 = true;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 573.7989760381826;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fd1 > ld0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought97.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought97.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    boolean lb4 = false;
    ad1 *= -1;
    boolean lb5 = true;
    lb4 = !lb5;
    boolean lb6 = false;
if(fo0 != null){
      lb6 = fo0.m2(fb0, fb1, lb3, lb4);
}
    boolean lb7 = true;
    lb5 = ad2 > ad3;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = ad4 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    ad2 *= -1;
    Output.points[8][5] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    Output.points[8][6] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought44.getInstance(ab3, ab4, fb0, fb1);
    boolean lb2 = true;
    Output.points[8][7] -= ad1;
    Output.points[8][8] -= ad2;
    boolean lb3 = false;
if(fo0 != null){
      lb0 = fo0.m2();
}
    lb2 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = !lb0;

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
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought68.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(ao2 != null){
      ao2.m2();
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought62.getInstance(fo0, fo1, ao1, ao2);
    fd0 *= -1;
    fd1 *= -1;
    fb1 = fd0 > fd1;
    double ld3 = 680.701945947738;
    Output.points[0][0] -= ld3;
    Output.points[0][1] -= fd0;
    lb1 = fd1 < ld3;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld3, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
    lb1 = ld3 < fd0;
    if (fb0) {
        boolean lb4 = true;
        fb0 = fd1 < ld3;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld3, fd0);
}
        boolean lb5 = true;
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
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 - ad1;
    fb0 = fb1 || lb0;
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    if (lb0) {
        fb0 = fd0 < fd1;
        ad1 = ad2 + ad3;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
        Thought lo1 = Thought57.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
        ad1 = ad2 - ad3;
        fb1 = lb0 || fb0;
        double ld2 = 537.663657812716;
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
    ab1 = ab2 && ab3;
    double ld0 = 833.5562402402154;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    ab4 = !fb0;
if(ao1 != null){
      fd0 = ao1.m3(fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought61.getInstance();
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    boolean lb2 = true;
    ab1 = fd0 > fd1;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ld0 > fd0;
    lb2 = !ab1;
    double ld3 = 300.8398936545217;
    ab2 = !ab3;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb2);
}
    ab1 = ab2 && ab3;
    boolean lb4 = false;
    double ld5 = 136.12799342568198;
    double ld6 = 258.24661095274604;
    ab3 = !ab4;
    boolean lb7 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    lb0 = !ab1;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao2.m3(fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
    ab1 = !ab2;
    ab3 = ad1 > ad2;
if(ao3 != null){
      ad3 = ao3.m3();
}
    ad4 = fd0 + fd1;
    double ld2 = 350.1154221488057;
    ld2 = ad1 + ad2;
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ld2, ab4, fb0, fb1, lb0);
}
    boolean lb3 = true;
    lb1 = !lb3;

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
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 || fb0;
        fd0 = fd1 - fd0;
        fb1 = fb0 && fb1;
        fd1 = fd0 - fd1;
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
            fb0 = fb1 && fb0;
            fd0 = fd1 - fd0;
            Thought lo0 = Thought73.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
            fb1 = fb0 || fb1;
if(fo0 != null){
              fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
            fd1 = fd0 + fd1;
            fb0 = fb1 && fb0;
            fb1 = !fb0;
            fb1 = fd0 < fd1;
            fd0 *= -1;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
              fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
              fd0 = fo1.m3();
}
            Output.points[0][2] += fd1;
}}
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
    fd0 *= -1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 828.4347732022696;
    double ld1 = 27.39098445696455;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld2 = 171.72140339804608;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(ld1, ld2, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, ld1, ld2, fd0);
}
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
          fo0.m3(fd1, ld0, ld1, ld2, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld0;
    for(int i0=0; i0<10; i0++){
        double ld3 = 940.7618246687656;
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ld2 = fd0 + fd1;
    ld0 = ld1 + ld2;
    fd0 *= -1;
    Thought lo4 = Thought71.getInstance(fd1, ld0, ld1, ld2);
    ab2 = fd0 > fd1;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, ld2, fd0);
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
    fb0 = !fb1;
    fb0 = !fb1;
    ad1 *= -1;
    fb0 = fb1 || fb0;
    double ld0 = 40.162027908300665;
    boolean lb1 = false;
    Thought lo2 = Thought12.getInstance(fb0, fb1, lb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2();
}
    double ld3 = 990.0066954329867;
    Output.points[0][3] -= ld3;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    ab2 = ab3 && ab4;
    double ld0 = 903.5406631390163;
    fb0 = fb1 || ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    Thought lo1 = Thought42.getInstance(ld0, ad1, ad2, ad3);
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    Output.points[0][4] -= ad3;
    ab1 = ab2 && ab3;
    boolean lb2 = false;
    ad4 = fd0 - fd1;
    Thought lo3 = Thought21.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo4 = Thought47.getInstance(ld0, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
    Thought lo5 = Thought83.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
    boolean lb6 = false;
    if (ab4) {
        Thought lo7 = Thought79.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb6);
        ab1 = !ab2;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
        ab3 = ad3 < ad4;
if(fo1 != null){
          fo1.m2(ab4, fb0, fb1, lb2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > fd0;
        fd1 = fd0 - fd1;
        fb1 = fd0 > fd1;
        }
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    fb1 = !lb0;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    double ld2 = 358.81658311714597;
    Thought lo3 = Thought56.getInstance(ao3, ao4, fo0, fo1, lb0, lb1, fb0, fb1);
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld2, fd0, fd1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2);
}
    fd0 = fd1 - ld2;
    lb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb0);
}
    ld2 = fd0 + fd1;
    ld2 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2();
}
    fb1 = fb0 || fb1;
    fb0 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fb1 = ao3.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
        fb0 = ad2 > ad3;
        fb1 = ad4 > fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
        boolean lb1 = false;
        lb0 = !lb1;
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
        fb0 = fd0 < fd1;
        for(int i1=0; i1<10; i1++){
if(ao4 != null){
              ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
            fb1 = !lb0;
if(fo0 != null){
              fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
            ad4 = fd0 - fd1;
            boolean lb2 = true;
            lb0 = ad1 < ad2;
            Thought lo3 = Thought79.getInstance(lb1, fb0, fb1, lb2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2();
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    double ld0 = 582.1758295445285;
    ab4 = fb0 && fb1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, fd0, fd1);
}
    double ld1 = 773.5045918131605;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ld0, ld1, fd0, fd1);
}
    boolean lb2 = true;
    ld0 *= -1;
    ld1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    Output.points[0][5] += ld0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo3 = Thought4.getInstance(ld1, fd0, fd1, ld0, fb1, lb2, ab1, ab2);
    double ld4 = 141.53047551459966;
    ab3 = !ab4;
    boolean lb5 = true;
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld4, fd0, fd1, ld0, ab4, fb0, fb1, lb2);
}
    lb5 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fd1 *= -1;
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ab3 = ab4 || fb0;
    fb1 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = ad3 < ad4;
    ab4 = fb0 || fb1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ab2 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
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
    Thought lo0 = Thought97.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
    lb2 = fd1 > fd0;
    fb0 = !fb1;
    Output.points[0][6] += fd1;
if(fo1 != null){
      fo1.m2();
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, lb2, lb3, fb0);
}
    fb1 = lb1 || lb2;
    Output.points[0][7] += fd0;
    fd1 *= -1;
    Output.points[0][8] += fd0;
        fd1 = fd0 + fd1;
    boolean lb4 = true;
    boolean lb5 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb3, lb4, lb5, lb6);
}
    double ld7 = 38.6393893465033;

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
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought10.getInstance(fb0, fb1, lb0, fb0);
    fd0 *= -1;
    fb1 = fd1 > fd0;
    double ld2 = 88.01659871872589;
        Output.points[1][0] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    double ld3 = 327.3141014256813;
    double ld4 = 993.3207644877644;
    ld2 = ld3 - ld4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, ld3, ld4, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    Thought lo5 = Thought77.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld3, ld4, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 < ld2;
    Thought lo6 = Thought86.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    boolean lb7 = false;
    fb0 = fb1 && lb0;
    double ld8 = 393.18939579487954;

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
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought13.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    double ld2 = 343.07572952252997;
    boolean lb3 = true;
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
}
