package genetic;
import java.util.ArrayList;
class Thought16 extends Thought{
private static ArrayList<Thought16> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 870.699571412238;
private double fd1 = 18.992394860546515;
private Thought fo0 = null;
private Thought fo1 = null;
Thought16 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought16 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought16 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought16 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought16 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought16 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought16 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought16 instance = new Thought16 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought26.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought71.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    Thought lo3 = Thought5.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Output.points[8][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    boolean lb4 = true;
    boolean lb5 = false;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, lb5, fb0, fb1, lb1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    Thought lo0 = Thought3.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, ab1, ab2);
}
    double ld2 = 803.5633876329046;
    Output.points[8][4] += fd0;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb1;
    lb3 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb1 = ld2 > fd0;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
        Output.points[8][5] += ad1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
        fd0 = fd1 + ad1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb1 = false;
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
    ab2 = ad2 < ad3;
    Output.points[8][6] -= ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ad1 *= -1;
    Output.points[8][7] += ad2;
    ad3 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 - fd1;
    double ld0 = 569.5509158390315;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = ad4 < fd0;
    fd1 = ld0 + ad1;
    ad2 *= -1;
if(fo0 != null){
      ab3 = fo0.m2(ad3, ad4, fd0, fd1);
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
    double ld0 = 860.692980219602;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Output.points[8][8] -= fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(ao3 != null){
      fb1 = ao3.m2();
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    double ld1 = 130.69846371456381;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ld1 *= -1;
    boolean lb2 = true;
    fd0 = fd1 + ld0;
    ld1 = fd0 + fd1;
    ld0 *= -1;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
    ld1 = fd0 - fd1;
    if (fb1) {
        ld0 = ld1 + fd0;
        Thought lo3 = Thought24.getInstance(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb2);
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
    fb1 = ad2 < ad3;
    boolean lb0 = true;
    boolean lb1 = false;
    double ld2 = 940.5580429775874;
    boolean lb3 = true;
    lb0 = lb1 || lb3;
    fb0 = fb1 && lb0;
    double ld4 = 82.39008498009728;
    lb1 = lb3 && fb0;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
    Output.points[0][0] -= fd1;
    ld2 *= -1;
    fb1 = lb0 || lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld4, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(lb3, fb0, fb1, lb0);
}
    ad4 *= -1;
    Thought lo5 = Thought29.getInstance();
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld2, ld4, ad1, lb1, lb3, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3);
}
    double ld6 = 687.5634255327949;

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
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    ab1 = !ab2;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld0 = 799.4208215423687;
    Output.points[0][1] += ld0;
    ab1 = !ab2;
    Thought lo1 = Thought30.getInstance(ao2, ao3, ao4, fo0);
    ab3 = fd0 > fd1;
    Output.points[0][2] -= ld0;

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
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
    boolean lb0 = true;
    Thought lo1 = Thought15.getInstance(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb2 = false;
    ab1 = fd1 > ad1;
if(ao2 != null){
      ab2 = ao2.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = lb2 && ab1;
    boolean lb3 = true;
    fd1 *= -1;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Thought lo4 = Thought72.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
        fd0 *= -1;
    fd1 = ad1 - ad2;
    fb1 = ad3 < ad4;
    boolean lb5 = true;
    double ld6 = 244.15651668923263;
    Output.points[0][3] -= ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, lb2, lb3, lb5);
}
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      ld6 = fo1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld6;
    ad1 = ad2 + ad3;

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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[0][4] += fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
    fb0 = fd1 > fd0;
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
    ab2 = ab3 && ab4;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        if (ab4) {
            boolean lb0 = true;
if(fo0 != null){
              fd1 = fo0.m3();
}
            boolean lb1 = true;
            double ld2 = 765.5104924329847;
            for(int i1=0; i1<10; i1++){
if(fo1 != null){
                  ld2 = fo1.m3(fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
                double ld3 = 741.8319144550067;
                lb0 = fd0 < fd1;
                ld3 *= -1;
                boolean lb4 = false;
                boolean lb5 = true;
                lb5 = lb0 || lb1;
                ld2 = fd0 - fd1;
if(fo0 != null){
                  ab1 = fo0.m2(fo1, fo0, fo1, fo0, ld3, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb4, lb5, lb0);
}
}}}
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
    ad1 *= -1;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        double ld0 = 964.832370516398;
        ad1 = ad2 + ad3;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
        lb1 = fb0 && fb1;
        lb1 = fb0 || fb1;
        Thought lo2 = Thought34.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
          fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
        Output.points[0][5] -= fd0;
        fb0 = fd1 > ld0;
if(fo1 != null){
          fo1.m2();
}
        }
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[0][6] += ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought68.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought81.getInstance(fb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
        for(int i0=0; i0<10; i0++){
        Output.points[0][7] -= ad2;
        ad3 *= -1;
if(fo1 != null){
          ab1 = fo1.m2();
}
        boolean lb2 = false;
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
    fb0 = fd1 < fd0;
    Thought lo0 = Thought11.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    double ld1 = 214.5384252966312;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    boolean lb2 = true;
    boolean lb3 = false;
        Thought lo4 = Thought14.getInstance(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = !fb1;
    ad1 *= -1;
    if (lb0) {
        ad2 = ad3 - ad4;
        boolean lb1 = false;
        boolean lb2 = true;
        fd0 *= -1;
        double ld3 = 736.0651372552949;
        lb2 = !lb0;
        fb0 = !fb1;
        lb1 = !lb2;
        lb0 = fd0 > fd1;
        Thought lo4 = Thought95.getInstance();
        if (fb0) {
if(ao2 != null){
              ld3 = ao2.m3(ad1, ad2, ad3, ad4, fb1, lb1, lb2, lb0);
}
            fd0 = fd1 - ld3;
            fb0 = fb1 || lb1;
            lb2 = ad1 > ad2;
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1);
}
            lb0 = ad3 > ad4;
if(ao2 != null){
              ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld3, ad1, fb0, fb1, lb1, lb2);
}
            ad2 = ad3 + ad4;
            fd0 *= -1;
if(ao1 != null){
              ao1.m1(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb1);
}
if(fo1 != null){
              fo1.m3(fd1, ld3, ad1, ad2);
}
}}
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought34.getInstance(ab1, ab2, ab3, ab4);
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    boolean lb1 = false;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = lb1 || ab1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought87.getInstance(fd1, fd0, fd1, fd0);
    lb1 = !lb2;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
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
    Output.points[0][8] -= ad1;
    boolean lb0 = false;
if(ao1 != null){
      ad2 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 && lb0;
    ad3 = ad4 + fd0;
    boolean lb1 = true;
    Thought lo2 = Thought87.getInstance(fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
    ad4 *= -1;
    ab4 = fb0 || fb1;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    lb0 = !lb1;
    ab1 = ab2 && ab3;
    fd0 *= -1;
    double ld3 = 639.1256235621613;
    fd0 = fd1 - ld3;

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
    Output.points[1][0] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought47.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        fb0 = !fb1;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    lb1 = fb0 || fb1;
    double ld2 = 413.4563966932591;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        lb3 = ld2 > fd0;
        fd1 = ld2 - fd0;
        double ld4 = 849.5117910990004;
        double ld5 = 994.1153819717508;
        ld2 = fd0 - fd1;
        lb1 = ld4 > ld5;
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
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fd0 *= -1;
if(fo1 != null){
          fo1.m2();
}
        boolean lb2 = false;
        } else if (fb1) {
if(fo0 != null){
          lb0 = fo0.m2(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        double ld3 = 267.668826545176;
        } else {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        if (lb1) {
            ab1 = ab2 || ab3;
            Output.points[1][1] += fd1;
            boolean lb4 = true;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
            lb4 = lb0 && lb1;
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
            ab1 = ab2 && ab3;
            double ld5 = 158.9575666603774;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought52.getInstance();
    fb1 = ad2 > ad3;
    Thought lo1 = Thought2.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought36.getInstance(fo0, fo1, fo0, fo1);
    Thought lo3 = Thought13.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    Thought lo4 = Thought73.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fd1 < ad1;
    fb1 = ad2 < ad3;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    ad4 = fd0 - fd1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m1();
}
    ad2 = ad3 - ad4;
    ab2 = fd0 > fd1;
    Thought lo0 = Thought99.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    ab1 = !ab2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    Output.points[1][2] += ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
    ad4 *= -1;
    ab1 = !ab2;
    double ld2 = 107.44797515091881;
    ab3 = !ab4;
    Thought lo3 = Thought31.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[1][3] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    if (fb0) {
        Thought lo0 = Thought62.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
          fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          ao1.m3();
}
        Output.points[1][4] -= fd1;
        Thought lo1 = Thought14.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
        fb1 = fd0 > fd1;
        fb0 = fd0 < fd1;
        fd0 = fd1 - fd0;
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
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    ad1 *= -1;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    boolean lb1 = true;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fd0 = ao1.m3();
}
    double ld1 = 765.8330718697825;
    double ld2 = 494.9265764315584;
if(ao2 != null){
      ld2 = ao2.m3(fd0, fd1, ld1, ld2, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab2 = fd0 > fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought92.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, ab1);
}
    fd1 = ad1 - ad2;
    Output.points[1][5] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ab2 = !ab3;
    Output.points[1][6] += ad2;
    Thought lo2 = Thought5.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    ad1 *= -1;
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
    ab1 = ad3 > ad4;
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        lb0 = ab1 || ab2;
        Thought lo3 = Thought0.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
}
        double ld4 = 55.45104214766363;
        ld4 *= -1;
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
    boolean lb0 = true;
    lb0 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fb1 && lb0;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
        fd1 = fd0 + fd1;
        fb1 = lb0 && fb0;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    double ld1 = 685.7862673265447;
    ld1 = fd0 - fd1;
    lb0 = ab1 && ab2;
    Thought lo2 = Thought35.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
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
    fb0 = fb1 && fb0;
    ad2 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought74.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    double ld1 = 51.929487828858655;
    fd0 = fd1 - ld1;
    boolean lb2 = true;
    ad1 = ad2 + ad3;
    Thought lo3 = Thought71.getInstance(fo0, fo1, fo0, fo1);
    boolean lb4 = true;
    lb2 = ad4 > fd0;
    lb4 = fb0 || fb1;
    double ld5 = 591.7924886564163;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld5, lb2, lb4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb4, fb0, fb1);
}
    ad1 = ad2 + ad3;

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
    ab1 = !ab2;
        ab3 = ad2 < ad3;
    double ld0 = 692.5746581845342;
    boolean lb1 = true;
    ad3 *= -1;
    ad4 *= -1;
    Thought lo2 = Thought70.getInstance(fd0, fd1, ld0, ad1);
    double ld3 = 477.46918064983106;
    ab3 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld0 = ld3 + ad1;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
    ad2 = ad3 - ad4;
    double ld4 = 934.9209379217632;

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
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd0 = ao2.m3();
}
        boolean lb0 = false;
        lb0 = fb0 || fb1;
if(ao3 != null){
          ao3.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
        boolean lb1 = true;
        }
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought0.getInstance(fb0, fb1, fb0, fb1);
if(ao1 != null){
      fb0 = ao1.m2();
}
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
        lb1 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;

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
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 225.06567234035512;
    fb0 = fb1 && ab1;
if(ao1 != null){
      ao1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao2 != null){
      ao2.m2();
}
    Thought lo1 = Thought81.getInstance(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = ld0 - fd0;
    ab4 = fd1 < ld0;
    fd0 *= -1;
    fb0 = !fb1;
    double ld2 = 918.8169367213807;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld2, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    Thought lo3 = Thought38.getInstance(ld2, fd0, fd1, ld0);

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
    ad2 = ad3 + ad4;
    Thought lo0 = Thought39.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    ab1 = ad3 < ad4;
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    ab1 = ab2 && ab3;
    boolean lb1 = false;
    ab3 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    for(int i0=0; i0<10; i0++){
        double ld2 = 104.3347875785357;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld2, ad1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          ab1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, lb1, ab1, ab2, ab3);
}
if(ao3 != null){
          fd1 = ao3.m3(ld2, ad1, ad2, ad3);
}
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
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought20.getInstance();
    Thought lo1 = Thought28.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    Output.points[1][7] += fd1;

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
    fb0 = fd0 > fd1;
    fb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 233.96131110929048;
    lb0 = fd0 > fd1;
    boolean lb2 = false;
    ld1 = fd0 - fd1;
    lb2 = !fb0;
    fb1 = lb0 && lb2;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb2, fb0);
}
    double ld3 = 117.73917575057837;
    fb1 = !lb0;
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
        double ld4 = 66.71407907543896;
    Output.points[1][8] -= ld1;

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
    Thought lo0 = Thought67.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo1 = Thought29.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld2 = 42.828621757679755;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    boolean lb3 = false;
    Output.points[2][0] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ld2 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld2, fd0, fd1, fb1, lb3, fb0, fb1);
}
    double ld4 = 370.8486391287592;
    ld2 = ld4 - fd0;
    lb3 = fb0 || fb1;
    fd1 = ld2 - ld4;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld4, lb5, fb0, fb1, lb3);
}
if(fo1 != null){
      lb5 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb3, lb5);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld2, ld4);
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
