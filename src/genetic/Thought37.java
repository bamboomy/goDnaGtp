package genetic;
import java.util.ArrayList;
class Thought37 extends Thought{
private static ArrayList<Thought37> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 241.21852548335633;
private double fd1 = 256.57602373641316;
private Thought fo0 = null;
private Thought fo1 = null;
Thought37 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought37 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought37 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought37 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought37 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 733.7240108163593;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        Thought lo1 = Thought51.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
        Output.points[5][2] += fd1;
        ld0 = fd0 - fd1;
        ld0 = fd0 + fd1;
        Output.points[5][3] -= ld0;
        fb1 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        if (fb0) {
            fb1 = fb0 || fb1;
            boolean lb2 = true;
            Output.points[5][4] -= fd0;
if(fo0 != null){
              fo0.m3(fd1, ld0, fd0, fd1);
}
            Thought lo3 = Thought71.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought90.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought99.getInstance(fo0, fo1, fo0, fo1);

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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
    fb0 = !fb1;
    fb0 = ad3 > ad4;
    Thought lo0 = Thought90.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought15.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    boolean lb2 = false;
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3();
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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ab3 = ad4 < fd0;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    double ld0 = 96.16752980297612;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    Thought lo1 = Thought80.getInstance(fb1, ab1, ab2, ab3);
        boolean lb2 = false;
    ab3 = ad1 < ad2;
    ab4 = fb0 || fb1;
    boolean lb3 = false;
if(fo1 != null){
          fo1.m2();
}
    ad3 *= -1;
    lb2 = lb3 || ab1;
    boolean lb4 = false;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb2, lb3, lb4);
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
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
    Thought lo1 = Thought0.getInstance();
    Output.points[5][5] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;

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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 64.00719965333359;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, ld0, ad1);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought26.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
      fb1 = ao1.m2();
}
    Thought lo2 = Thought92.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[5][6] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ad1, ad2);
}
    Thought lo3 = Thought54.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
if(ao1 != null){
      ld0 = ao1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb4 = false;

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
    ab1 = !ab2;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    double ld0 = 655.4594059830565;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    ab4 = ld0 > fd0;
    fb0 = fb1 && ab1;
    fd1 *= -1;
    boolean lb1 = false;
if(ao4 != null){
          ao4.m2(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    fd0 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    Output.points[5][7] -= ld0;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
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
if(ao3 != null){
          ao2 = ao3.m4();
}
        Output.points[5][8] -= ad2;
        ab1 = ad3 < ad4;
        fd0 = fd1 - ad1;
        ad2 = ad3 + ad4;
        double ld0 = 864.4908299111323;
        ad4 = fd0 + fd1;
        ld0 *= -1;
        }
    for(int i1=0; i1<10; i1++){
        boolean lb1 = false;
        ad2 *= -1;
        ab1 = ad3 > ad4;
if(ao4 != null){
          fd0 = ao4.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && lb1;
        boolean lb3 = false;
if(fo0 != null){
          fo0.m1(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
        lb2 = ad4 < fd0;
        boolean lb4 = true;
        boolean lb5 = true;
if(ao1 != null){
          fo1 = ao1.m4(lb3, lb4, lb5, ab1);
}
if(ao2 != null){
          ab2 = ao2.m2();
}
        Output.points[6][0] -= fd1;
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
    Thought lo0 = Thought96.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    double ld1 = 115.92812618326923;
    double ld2 = 408.37555078127355;
    double ld3 = 67.33674338062394;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        lb4 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, ld2, ld3, fd0, lb4, fb0, fb1, lb4);
}
    fd1 *= -1;
    fb0 = fb1 || lb4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb4, fb0);
}
    fb1 = ld1 < ld2;
    boolean lb5 = false;
    Output.points[6][1] -= ld3;
    fd0 = fd1 - ld1;
    Output.points[6][2] -= ld2;
    boolean lb6 = true;
if(fo0 != null){
      lb4 = fo0.m2(ld3, fd0, fd1, ld1);
}
    lb5 = !lb6;
    Thought lo7 = Thought76.getInstance(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);
    ld1 = ld2 - ld3;

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
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
        boolean lb0 = false;
    boolean lb1 = false;
    ab2 = fd1 < fd0;
        fd1 = fd0 - fd1;
    ab3 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fd1 = fd0 + fd1;
    Thought lo2 = Thought56.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    lb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = fd0 < fd1;
    boolean lb3 = false;
    ab3 = fd0 > fd1;
    boolean lb4 = false;
    Output.points[6][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 || lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, ab1, ab2, ab3);
}
    Output.points[6][4] -= fd1;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, lb3);
}
    fd0 *= -1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[6][5] += ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m1();
}
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    lb0 = !lb1;
    fb0 = fb1 && lb0;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    lb1 = fd1 > ad1;
    Thought lo2 = Thought5.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fb1 || lb0;

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
    ab1 = ad2 > ad3;
    Thought lo0 = Thought53.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    ab2 = ab3 || ab4;
    Thought lo1 = Thought11.getInstance(fb0, fb1, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2();
}
    ab4 = !fb0;
    fb1 = ab1 && ab2;
    ab3 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
    boolean lb0 = false;
        lb0 = fb0 || fb1;
    lb0 = fd1 < fd0;
        fb0 = fd1 < fd0;
    Output.points[6][6] += fd1;
    fb1 = !lb0;
    boolean lb1 = true;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    fd0 = fd1 - fd0;
    boolean lb3 = false;
    lb0 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, lb2, lb3, fb0);
}
    fd1 *= -1;
    Thought lo4 = Thought32.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || lb1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(ao2 != null){
          ao1 = ao2.m4(lb2, lb3, fb0, fb1);
}
        boolean lb5 = false;
if(ao4 != null){
          ao3 = ao4.m4();
}
        lb5 = fd1 < fd0;
        Output.points[6][7] += fd1;
        boolean lb6 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    fb0 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought40.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
    fb1 = fb0 || fb1;
    fd0 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought5.getInstance(lb1, fb0, fb1, lb1);

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
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo0 = Thought39.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ab2 = ab3 && ab4;
    Thought lo1 = Thought4.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = fd0 < fd1;
    Thought lo2 = Thought30.getInstance(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
    Thought lo3 = Thought67.getInstance(fd0, fd1, fd0, fd1);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought4.getInstance();
    fb1 = ab1 && ab2;
    fd0 *= -1;
    ab3 = !ab4;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld5 = 113.64748982358824;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
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
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought85.getInstance(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
    Output.points[6][8] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought71.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
    Thought lo2 = Thought50.getInstance(ab4, fb0, fb1, ab1);
    ad3 = ad4 - fd0;
if(ao4 != null){
      fd1 = ao4.m3();
}
    double ld3 = 110.1221033956081;
    boolean lb4 = false;
    ld3 *= -1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb4 = ab1 && ab2;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb4);
}
    fd0 *= -1;
        fd1 = ld3 - ad1;
    ab1 = ad2 < ad3;

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
    double ld0 = 146.19496858837874;
    Thought lo1 = Thought62.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    ld0 *= -1;
    fd0 = fd1 - ld0;
    fb0 = fd0 < fd1;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    boolean lb2 = true;
    fb0 = fd1 > ld0;
    boolean lb3 = false;
    boolean lb4 = true;
    Thought lo5 = Thought63.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
    fd1 = ld0 + fd0;
    if (lb4) {
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb2, lb3);
}
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ld0 = fd0 - fd1;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought46.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[7][0] += fd0;
if(fo0 != null){
      lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fd1 = fd0 + fd1;
        boolean lb2 = false;
        double ld3 = 384.3030326343555;
if(fo1 != null){
          ld3 = fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld3, fd0, fb0, fb1, lb2, lb0);
}
        Output.points[7][1] += fd1;
        ab1 = ab2 && ab3;
        ab4 = ld3 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = !fb1;
        double ld4 = 167.13128800110428;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld4, fd0, fd1, lb2, lb0, ab1, ab2);
}
        ab3 = ab4 || fb0;
        fb1 = ld3 < ld4;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[7][2] += ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought7.getInstance();
    fb1 = !fb0;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld1 = 941.055610361344;
    boolean lb2 = false;
    Thought lo3 = Thought15.getInstance(fo1, fo0, fo1, fo0);
    Output.points[7][3] += ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld1, ad1);
}
    double ld4 = 112.63122143996564;

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
    Thought lo0 = Thought62.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    Thought lo1 = Thought17.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m2();
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
    fb0 = ad4 < fd0;
    fb1 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = ad1 > ad2;
    boolean lb2 = true;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb2, ab1);
}
    ab2 = ad2 < ad3;
    Output.points[7][4] += ad4;
    boolean lb3 = false;
    if (ab2) {
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
        lb3 = fd0 > fd1;
        ad1 = ad2 - ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
}
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
    double ld0 = 899.7835545089632;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fb1 = !fb0;
    fd0 *= -1;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m1(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd1 = ld0 - fd0;
    double ld1 = 274.9563298334912;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, ld1, fd0);
}
    lb2 = fb0 && fb1;
    fd1 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(ao1, ao2, ao3, ao4, ld0, ld1, fd0, fd1);
}
    fb0 = fb1 || lb2;
    Thought lo3 = Thought96.getInstance(fb0, fb1, lb2, fb0);
    boolean lb4 = true;
    if (fb0) {
        Output.points[7][5] -= ld0;
if(fo1 != null){
          fo0 = fo1.m4();
}
}
Thought.STACK_COUNTER++;
return ld1;
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
    if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + ad1;
        fb0 = !fb1;
        fb0 = fb1 && fb0;
        ad2 = ad3 - ad4;
        boolean lb0 = false;
        boolean lb1 = true;
        lb1 = !fb0;
        fd0 *= -1;
        fb1 = !lb0;
        Output.points[7][6] -= fd1;
        Thought lo2 = Thought55.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
        Output.points[7][7] -= fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
        lb1 = ad4 > fd0;
        double ld3 = 490.84724000450797;
        Thought lo4 = Thought86.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld3, ad1);
if(fo1 != null){
          fo1.m2(fb0, fb1, lb0, lb1);
}
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
    fd1 = fd0 - fd1;
    double ld0 = 337.3531984480818;
        Thought lo1 = Thought27.getInstance();
if(ao1 != null){
      ld0 = ao1.m3(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    Output.points[7][8] += fd1;
    ld0 *= -1;
    Output.points[8][0] -= fd0;
    ab2 = ab3 || ab4;
    fd1 = ld0 - fd0;
    boolean lb2 = true;
    fd1 *= -1;
    ab4 = ld0 < fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb1, lb2, ab1, ab2);
}
    ab3 = ab4 && fb0;
    double ld3 = 500.39044571015813;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            ld0 = ld3 - fd0;
if(ao1 != null){
              fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb2, ab1, ab2, ab3);
}
            Thought lo4 = Thought5.getInstance(fd1, ld0, ld3, fd0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
          ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
        Thought lo0 = Thought4.getInstance();
        fd0 *= -1;
        fd1 = ad1 + ad2;
if(ao3 != null){
          fb0 = ao3.m2(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
          ab4 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
        double ld1 = 389.77815501633086;
        ab1 = ad4 < fd0;
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
        Output.points[8][1] += fd1;
        ld1 *= -1;
        ad1 = ad2 + ad3;
if(ao1 != null){
          ao1.m2(ad4, fd0, fd1, ld1);
}
}
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
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    double ld1 = 564.4190047044827;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb2 = false;
        double ld3 = 776.7010030995802;
    boolean lb4 = false;
    Thought lo5 = Thought47.getInstance(fo1, fo0, fo1, fo0, lb2, lb4, fb0, fb1);

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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    Thought lo1 = Thought15.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    Thought lo2 = Thought47.getInstance(fb0, fb1, lb0, ab1);
    ab2 = fd1 < fd0;
    ab3 = fd1 < fd0;
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
    Output.points[8][2] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    double ld3 = 289.093293150967;
    ab3 = ld3 > fd0;
    Thought lo4 = Thought93.getInstance(fd1, ld3, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3);
}
    Output.points[8][3] += fd0;
    ab4 = !fb0;

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
      ad1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought50.getInstance();
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought30.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && lb1;
    fb0 = fb1 && lb1;
    fd1 = ad1 + ad2;

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
    Thought lo0 = Thought8.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    Thought lo1 = Thought61.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 = ad1 + ad2;
    fb1 = ab1 || ab2;
    ad3 *= -1;
    Thought lo2 = Thought52.getInstance(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb3, ab1, ab2, ab3);
}
    Thought lo4 = Thought73.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb3);
    Output.points[8][4] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb5 = false;
    ad1 = ad2 + ad3;

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
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    double ld0 = 845.0852115957769;
    double ld1 = 103.70917333021579;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought4.getInstance(ao2, ao3, ao4, fo0);
    ld0 *= -1;
    fb1 = ld1 < fd0;
    Thought lo3 = Thought0.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fd1 > ld0;
    fb1 = ld1 > fd0;
    fd1 = ld0 - ld1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo4 = Thought22.getInstance(fd1, ld0, ld1, fd0);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld0, ld1, fd0, fd1);
}
if(ao2 != null){
      ld0 = ao2.m3(fb1, fb0, fb1, fb0);
}
    ld1 = fd0 - fd1;
    boolean lb5 = true;
    fb0 = !fb1;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 975.3609525903848;
    ld0 = ad1 - ad2;
if(ao4 != null){
      fb0 = ao4.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ld0 = fo0.m3(fo1, ao1, ao2, ao3);
}
        fb1 = fb0 || fb1;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        boolean lb1 = true;
        double ld2 = 114.96640381886431;
        Output.points[8][5] -= ad4;
        }
    fd1 = ld0 + ad1;
    boolean lb3 = true;
    lb3 = fb0 && fb1;
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb3, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
    ab4 = fb0 || fb1;
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought88.getInstance(ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = !fb1;
    ab1 = fd0 < fd1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Output.points[8][6] += fd0;
    fd1 = fd0 + fd1;
    Output.points[8][7] -= fd0;
    boolean lb2 = true;

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
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad1 *= -1;
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    Output.points[8][8] -= ad2;
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought93.getInstance(ad2, ad3, ad4, fd0);
    lb0 = fd1 > ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
    ab1 = ad4 < fd0;
    fd1 = ad1 + ad2;

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
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    double ld0 = 701.9904210409289;
if(fo0 != null){
      fo0.m2();
}
    boolean lb1 = false;
    boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb1);
}
    fd0 = fd1 - ld0;
    lb2 = !fb0;
    fd0 *= -1;
    fd1 *= -1;
    fb1 = ld0 > fd0;
    double ld3 = 254.30366651099243;
    lb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      ld0 = fo1.m3(ld3, fd0, fd1, ld0);
}
    lb2 = fb0 && fb1;
    lb1 = lb2 && fb0;
    Output.points[0][0] += ld3;
    Output.points[0][1] -= fd0;
    double ld4 = 225.70560982335093;
    Thought lo5 = Thought48.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld3);

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
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        Output.points[0][2] += fd0;
    fd1 *= -1;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
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
    fd1 *= -1;
    fb0 = fd0 > fd1;
    double ld0 = 295.4342838820226;
        fb1 = ld0 < fd0;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    fb0 = ld0 < fd0;
        fb1 = fd1 > ld0;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
    boolean lb1 = false;
    Thought lo2 = Thought51.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
    boolean lb3 = true;

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
