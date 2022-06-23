package genetic;
import java.util.ArrayList;
class Thought40 extends Thought{
private static ArrayList<Thought40> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 990.0411611531508;
private double fd1 = 712.9158998488402;
private Thought fo0 = null;
private Thought fo1 = null;
Thought40 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought40 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought40 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought40 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought40 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought40 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought40 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought40 instance = new Thought40 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[7][4] -= fd1;
    double ld0 = 416.2325923452279;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
    lb2 = fd0 > fd1;
    fb0 = ld0 > fd0;
    double ld3 = 48.929792947482646;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (fb1) {
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
    ab1 = ab2 || ab3;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought60.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[7][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;

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
    if (fb1) {
if(fo1 != null){
          ad1 = fo1.m3();
}
        Thought lo0 = Thought99.getInstance(ad2, ad3, ad4, fd0);
        Thought lo1 = Thought72.getInstance(fb0, fb1, fb0, fb1);
        double ld2 = 933.6295606714726;
        fd0 *= -1;
        fb0 = !fb1;
        fd1 *= -1;
        boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
        lb3 = !fb0;
        fb1 = ld2 > ad1;
        Thought lo4 = Thought70.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb3);
        fd1 = ld2 - ad1;
        boolean lb5 = true;
        lb5 = fb0 && fb1;
        lb3 = !lb5;
        if (fb0) {
            Thought lo6 = Thought94.getInstance(fo0, fo1, fo0, fo1, fb1, lb3, lb5, fb0);
            fb1 = lb3 || lb5;
            boolean lb7 = true;
            lb5 = ad2 > ad3;
            fb0 = fb1 && lb7;
if(fo0 != null){
              lb3 = fo0.m2(fo1, fo0, fo1, fo0);
}
            ad4 *= -1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 313.3020167591711;
if(fo1 != null){
      fo1.m3();
}
    fb0 = fd0 > fd1;
    fb1 = ld0 > ad1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = ad1 < ad2;
if(fo0 != null){
      ab4 = fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[7][6] += ld0;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought84.getInstance();
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld0);
}
    boolean lb2 = false;
    double ld3 = 35.12406537591521;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb2, ab1, ab2);
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
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    Thought lo0 = Thought7.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fb1 = !fb0;
    fd1 *= -1;
        fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    Output.points[7][7] += fd1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    boolean lb1 = true;
    double ld2 = 98.11565209459958;
    Output.points[7][8] -= ld2;
    double ld3 = 95.62953406559201;
if(ao4 != null){
      ao3 = ao4.m4(ld3, fd0, fd1, ld2, fb0, fb1, lb1, fb0);
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
    ad2 = ad3 + ad4;
if(ao1 != null){
      fb0 = ao1.m2();
}
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought64.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
        Thought lo2 = Thought87.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = ad2 > ad3;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, fb0, fb1, lb1, lb3);
}
    boolean lb4 = false;
    lb4 = fb0 && fb1;
    Output.points[8][0] += ad2;
if(ao2 != null){
      ao1 = ao2.m4();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    double ld0 = 934.2156251347462;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
}
    double ld1 = 221.79476507936428;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ab4 = fb0 || fb1;
    Output.points[8][1] += ld1;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, ld1, lb2, ab1, ab2, ab3);
}
    Output.points[8][2] -= fd0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1();
}
        Thought lo3 = Thought9.getInstance(fd1, ld0, ld1, fd0);
        Output.points[8][3] -= fd1;
if(fo1 != null){
          fo1.m1(ab4, fb0, fb1, lb2);
}
        Thought lo4 = Thought69.getInstance(ao1, ao2, ao3, ao4, ld0, ld1, fd0, fd1);
        ld0 = ld1 - fd0;
        boolean lb5 = true;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, ld1, fd0, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb5);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        Thought lo6 = Thought21.getInstance(ld0, ld1, fd0, fd1, lb2, ab1, ab2, ab3);
        boolean lb7 = false;
if(ao4 != null){
          ld0 = ao4.m3();
}
if(fo0 != null){
          ld1 = fo0.m3(fd0, fd1, ld0, ld1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
        double ld0 = 45.608717562921065;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
    Output.points[8][4] -= ad1;
    Output.points[8][5] -= ad2;
    boolean lb2 = false;
    ad3 *= -1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
    double ld3 = 485.72030414843323;
    Output.points[8][6] += ld3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
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
    Thought lo0 = Thought6.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    double ld1 = 962.4160117688913;
    fb1 = fb0 || fb1;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    fd0 = fd1 + ld1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought27.getInstance();
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    ab2 = !ab3;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    lb1 = ab1 || ab2;
    Output.points[8][7] -= fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
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
    Thought lo0 = Thought67.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 148.21477881907072;
    Output.points[8][8] += ld1;
    ad1 *= -1;
    boolean lb2 = false;
    ad2 *= -1;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      lb3 = fo0.m2(fb0, fb1, lb2, lb3);
}
    fb0 = fb1 && lb2;
    boolean lb4 = true;
    lb3 = lb4 || fb0;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
    fb1 = lb2 || lb3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb4, fb0, fb1, lb2);
}
    lb3 = lb4 && fb0;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[0][0] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    lb1 = ab1 && ab2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought92.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo1 = Thought57.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fb0 && fb1;
    Thought lo2 = Thought84.getInstance();
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    boolean lb3 = false;
if(ao4 != null){
      lb3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb3, fb0);
}
    fb1 = fd0 > fd1;

Thought.STACK_COUNTER++;
return lb3;
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
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    Output.points[0][1] -= fd1;
    fb0 = ad1 < ad2;
    fb1 = fb0 && fb1;
    if (fb0) {
        fb1 = ad3 > ad4;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        double ld0 = 427.58067245801413;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4);
}
        fb0 = ad4 > fd0;
        Output.points[0][2] += fd1;
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
if(ao1 != null){
      ab1 = ao1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 *= -1;
if(ao4 != null){
      ao4.m1(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    double ld1 = 650.1680665428789;
    boolean lb2 = true;
    Thought lo3 = Thought86.getInstance(ab4, fb0, fb1, lb0);
    lb2 = ab1 && ab2;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0);
}
    ab3 = ab4 || fb0;
    fd1 = ld1 + fd0;
    boolean lb4 = false;
    fd1 = ld1 + fd0;
    fd1 = ld1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    lb4 = !ab1;
    boolean lb5 = true;
    boolean lb6 = true;
    boolean lb7 = true;
    Thought lo8 = Thought99.getInstance(ao4, fo0, fo1, ao1, lb6, lb7, ab1, ab2);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][3] += ad1;
    ad2 = ad3 - ad4;
    ab2 = !ab3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    if (ab2) {
        ad3 = ad4 + fd0;
        fd1 *= -1;
        if (ab3) {
            Thought lo0 = Thought77.getInstance();
if(ao3 != null){
              ad1 = ao3.m3(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
              fd1 = ao4.m3(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
              fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
            Thought lo1 = Thought77.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
if(ao2 != null){
              ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
            ad4 = fd0 + fd1;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
              ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
              ao3 = ao4.m4();
}
}}
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
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought96.getInstance(fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    Output.points[0][4] -= fd1;
    fb1 = !lb0;
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld2 = 523.1232137892908;
    fb1 = lb0 || fb0;
    boolean lb3 = false;

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
    if (ab1) {
        ab2 = ab3 || ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
        double ld0 = 115.47087834083099;
        ab4 = ld0 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
        fd0 *= -1;
        ab3 = !ab4;
        fb0 = fb1 || ab1;
        fd1 = ld0 + fd0;
        double ld1 = 854.7710614502051;
        boolean lb2 = true;
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        lb3 = ab1 && ab2;
if(fo1 != null){
          fo1.m2(fd0, fd1, ld0, ld1);
}
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
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
    Output.points[0][5] += ad2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    lb1 = ad3 < ad4;
    fd0 = fd1 + ad1;
    Output.points[0][6] -= ad2;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
    ad1 = ad2 + ad3;

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
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    double ld0 = 968.2093437267603;
    boolean lb1 = false;
    ab1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    Output.points[0][7] += fd1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = ad4 > fd0;
    fb1 = !lb1;
    Thought lo3 = Thought73.getInstance(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ld0 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
    boolean lb4 = true;
    lb2 = lb4 || ab1;
if(fo0 != null){
      ab2 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(ld0, ad1, ad2, ad3);
}
    ab3 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought96.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = fd0 > fd1;
    Output.points[0][8] -= fd0;
    lb1 = !fb0;
    Thought lo2 = Thought39.getInstance(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
        lb1 = !fb0;
    fd1 = fd0 + fd1;
    double ld3 = 197.4601587283842;
    fb1 = !lb1;
    ld3 *= -1;
    fb0 = !fb1;
    lb1 = !fb0;
    fd0 = fd1 - ld3;
    fb1 = lb1 || fb0;
    fd0 = fd1 + ld3;
    fd0 = fd1 - ld3;
    fb1 = lb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    Thought lo4 = Thought61.getInstance(fd0, fd1, ld3, fd0);

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
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ao1.m3(lb0, lb1, fb0, fb1);
}
    if (lb0) {
        } else {
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
        fb0 = !fb1;
        Output.points[1][0] -= ad2;
        lb0 = lb1 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
        ad1 = ad2 + ad3;
        double ld2 = 974.02426552949;
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
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ab3 = ab4 || fb0;
    Thought lo0 = Thought94.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    fd1 *= -1;
    boolean lb1 = false;
    ab3 = ab4 && fb0;
    boolean lb2 = false;
    fb0 = fb1 && lb1;
    Output.points[1][1] -= fd0;
    boolean lb3 = true;
    fd1 = fd0 + fd1;
    Output.points[1][2] -= fd0;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
if(ao4 != null){
      ab1 = ao4.m2(ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
    if (fb1) {
if(ao1 != null){
          ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
        ad3 = ad4 + fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, lb0, lb1, ab1, ab2);
}
        ad4 = fd0 + fd1;
if(fo1 != null){
          ad1 = fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0, lb0, lb1, ab1, ab2);
}
        Thought lo2 = Thought98.getInstance();
        boolean lb3 = true;
        boolean lb4 = true;
        ab1 = fd1 < ad1;
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
        ab2 = !ab3;
if(ao2 != null){
          ao2.m2(ab4, fb0, fb1, lb3);
}
        lb4 = !lb0;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[1][3] -= fd1;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    Output.points[1][4] += fd0;
    double ld0 = 473.67550036092393;
    fb1 = fd0 > fd1;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    double ld0 = 598.2609235860524;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    Thought lo2 = Thought15.getInstance();
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb3 = true;
    boolean lb4 = false;
    double ld5 = 616.5368923806935;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb3);
}
    Thought lo6 = Thought73.getInstance(fo0, fo1, fo0, fo1);

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
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    Thought lo0 = Thought91.getInstance();
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    fd0 = fd1 - ad1;
    fb1 = !fb0;
    ad2 *= -1;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo1 = Thought93.getInstance(fo1, fo0, fo1, fo0);
    if (fb1) {
if(fo1 != null){
          fo1.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad1 = ad2 - ad3;
    if (ab4) {
        fb0 = fb1 && ab1;
        } else {
        ab2 = ab3 && ab4;
        boolean lb0 = true;
        ad4 *= -1;
        fd0 = fd1 + ad1;
        boolean lb1 = true;
        ab3 = ab4 && fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        fb1 = fd1 > ad1;
        lb0 = ad2 > ad3;
        boolean lb2 = true;
if(fo1 != null){
          ad4 = fo1.m3(lb1, lb2, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        ab3 = ad3 > ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
        Output.points[1][5] += ad3;
        ad4 = fd0 + fd1;
        ad1 = ad2 - ad3;
        lb1 = ad4 < fd0;
        boolean lb3 = false;
        boolean lb4 = false;
        fd1 = ad1 - ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, lb2, lb3, lb4, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    Thought lo0 = Thought73.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    double ld2 = 826.627240870116;
if(ao2 != null){
      ao1 = ao2.m4();
}
        Thought lo3 = Thought55.getInstance(fd0, fd1, ld2, fd0);
if(ao3 != null){
      fd1 = ao3.m3(fb0, fb1, lb1, fb0);
}
    ld2 = fd0 + fd1;
    Thought lo4 = Thought59.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb1, fb0, fb1);
}
    fd1 = ld2 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 217.68392218799556;
    fb1 = !fb0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld0 = ad1 + ad2;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    ad3 *= -1;
    Output.points[1][6] -= ad4;
    fb0 = fd0 < fd1;
    Output.points[1][7] -= ld0;
    boolean lb1 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fb1 = !lb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m3(lb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
    boolean lb3 = false;
    boolean lb4 = true;
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, lb2, lb3, lb4);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab1 = fd0 > fd1;
    ab2 = ab3 || ab4;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 + ad1;
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought80.getInstance(fb1, ab1, ab2, ab3);
    boolean lb1 = true;
    Output.points[1][8] -= ad1;
    boolean lb2 = true;
    boolean lb3 = false;
        ad2 = ad3 + ad4;
    boolean lb4 = false;
    boolean lb5 = false;
    lb4 = !lb5;
    Thought lo6 = Thought64.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
    ab1 = ad3 < ad4;
    Thought lo7 = Thought82.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb1, lb1, lb2, lb3);
}
    lb4 = lb5 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4);
}
    boolean lb8 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = !lb1;

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
    Thought lo1 = Thought48.getInstance();
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb0;
    Output.points[2][0] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought10.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb2, fb0, fb1);
}
    fd1 *= -1;
    lb0 = fd0 > fd1;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[2][1] -= fd1;
    Output.points[2][2] -= fd0;
    fb1 = !fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
        fd0 *= -1;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    fb0 = fb1 || fb0;
        boolean lb0 = true;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 794.5583213606205;
    double ld2 = 434.63090879588896;
    ld2 = fd0 + fd1;

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
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    lb0 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought21.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo3 = Thought93.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
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
}
