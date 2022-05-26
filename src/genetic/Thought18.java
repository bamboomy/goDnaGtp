package genetic;
import java.util.ArrayList;
class Thought18 extends Thought{
private static ArrayList<Thought18> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 361.63184291616255;
private double fd1 = 876.0493277028177;
private Thought fo0 = null;
private Thought fo1 = null;
Thought18 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought18 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought18 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought18 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought18 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought18 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought18 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought18 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought18 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought18 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought18 instance = new Thought18 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    fb1 = lb0 && fb0;
    Thought lo1 = Thought5.getInstance();
    fd1 *= -1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    double ld2 = 893.5068816759293;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
}
    fb0 = !fb1;
    Thought lo3 = Thought18.getInstance(fo0, fo1, fo0, fo1);
    double ld4 = 502.23008747824707;
    lb0 = ld4 < fd0;
    Output.points[6][7] -= fd1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
    fb1 = ld4 > fd0;
    fd1 = ld2 + ld4;
    double ld5 = 439.57230824344015;
    lb0 = !fb0;
if(fo1 != null){
      ld5 = fo1.m3(fd0, fd1, ld2, ld4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld2);
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
    ab1 = fd1 > fd0;
    boolean lb0 = false;
    Thought lo1 = Thought0.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    fd1 *= -1;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
    if (ab1) {
        double ld3 = 280.84981013822494;
        ld3 = fd0 + fd1;
        ld3 = fd0 + fd1;
if(fo1 != null){
          fo1.m2(ld3, fd0, fd1, ld3);
}
        ab2 = fd0 < fd1;
        ab3 = ld3 < fd0;
        boolean lb4 = true;
        boolean lb5 = false;
        fd1 *= -1;
        boolean lb6 = false;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        ld3 = fd0 + fd1;
        double ld7 = 774.5336776598776;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, ld3, ld7, fd0, fd1, ab2, ab3, ab4, fb0);
}
        ld3 = ld7 + fd0;
        fb1 = fd1 > ld3;
        boolean lb8 = false;
        ld7 = fd0 + fd1;
        lb4 = ld3 > ld7;
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
    ad1 = ad2 - ad3;
    fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
    fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd0 = fd1 + ad1;
    fb1 = ad2 > ad3;
    boolean lb0 = false;
    Thought lo1 = Thought18.getInstance(ad4, fd0, fd1, ad1);
    Thought lo2 = Thought2.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[6][8] -= fd1;
    fb0 = ad1 < ad2;
    boolean lb3 = true;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
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
    ab2 = ab3 && ab4;
    double ld0 = 319.0851971347958;
if(fo1 != null){
      ld0 = fo1.m3();
}
        ad1 = ad2 + ad3;
    double ld1 = 933.3250394011785;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, ab1, ab2, ab3);
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
    fd0 *= -1;
    if (fb1) {
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fd0 = fd1 + fd0;
        fb0 = fd1 < fd0;
        Thought lo1 = Thought8.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
        boolean lb2 = true;
        lb0 = !lb2;
        fd1 *= -1;
        fb0 = fb1 && lb0;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
}
        lb2 = !fb0;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        fd0 *= -1;
        Thought lo3 = Thought4.getInstance(fb1, lb0, lb2, fb0);
        boolean lb4 = true;
        for(int i0=0; i0<10; i0++){
            fd1 = fd0 + fd1;
            }
        double ld5 = 834.6029400825985;
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    Thought lo0 = Thought9.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
        ad3 = ad4 - fd0;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought13.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    boolean lb2 = false;
    lb2 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
    double ld3 = 489.53839840736674;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
if(fo1 != null){
      fo1.m2(fb0, fb1, lb2, fb0);
}
    if (fb1) {
        lb2 = ad3 > ad4;
        fb0 = fd0 < fd1;
if(ao2 != null){
          ao1 = ao2.m4(ld3, ad1, ad2, ad3);
}
        Output.points[7][0] -= ad4;
        fb1 = lb2 && fb0;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        fd0 = fd1 - ld3;
        fb1 = !lb2;
        fb0 = fb1 && lb2;
        ad1 = ad2 + ad3;
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
    fd0 = fd1 + fd0;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        ab2 = fd1 < fd0;
    Thought lo0 = Thought1.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    ab1 = fd1 < fd0;
    fd1 *= -1;
    ab2 = !ab3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    ab1 = !ab2;

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
    if (ab1) {
        ad1 *= -1;
if(ao1 != null){
          ad2 = ao1.m3();
}
        boolean lb0 = true;
        ab1 = !ab2;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        Thought lo1 = Thought17.getInstance(lb0, ab1, ab2, ab3);
        ab4 = fb0 && fb1;
if(ao1 != null){
          lb0 = ao1.m2(ad3, ad4, fd0, fd1);
}
        ad1 = ad2 + ad3;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        } else {
        ad4 = fd0 - fd1;
        ab2 = ab3 || ab4;
        Output.points[7][1] -= ad1;
        ad2 = ad3 + ad4;
        fd0 = fd1 - ad1;
        fb0 = ad2 > ad3;
        boolean lb2 = false;
        for(int i0=0; i0<10; i0++){
            fb0 = ad4 < fd0;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    boolean lb0 = true;
    double ld1 = 766.1090750748788;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ld1 > fd0;
    boolean lb2 = true;
    boolean lb3 = true;
    Thought lo4 = Thought17.getInstance(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
    Output.points[7][2] -= fd1;
    Thought lo5 = Thought13.getInstance(lb2, lb3, fb0, fb1);
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb0, lb2, lb3, fb0);
}
    Thought lo6 = Thought7.getInstance(fd0, fd1, ld1, fd0, fb1, lb0, lb2, lb3);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fb0 = !fb1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
}
    Output.points[7][3] -= ld1;
    boolean lb7 = true;

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
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    lb1 = ab1 || ab2;
    boolean lb2 = true;
    ab2 = !ab3;
    fd1 = fd0 - fd1;
    ab4 = fd0 < fd1;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, lb1, lb2, lb3, ab1);
}
    Thought lo4 = Thought0.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo1.m3();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    double ld5 = 453.4163690138417;

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
    double ld0 = 292.5642479977858;
    Thought lo1 = Thought4.getInstance(fb0, fb1, fb0, fb1);
    boolean lb2 = false;
    double ld3 = 169.26361188557834;
    boolean lb4 = false;
    Thought lo5 = Thought19.getInstance(ld3, ad1, ad2, ad3);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb2 = ad4 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld3, ad1, lb4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb4, fb0, fb1, lb2);
}
    lb4 = fd1 < ld0;
    ld3 = ad1 - ad2;
    fb0 = fb1 || lb2;
    ad3 *= -1;
    Thought lo6 = Thought3.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb2);
}
    lb4 = fb0 || fb1;
    boolean lb7 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ad4 *= -1;
    ab1 = !ab2;
    fd0 *= -1;
    Output.points[7][4] += fd1;
    ab3 = ab4 && fb0;
    Output.points[7][5] += ad1;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
    Output.points[7][6] += ad4;
    boolean lb0 = true;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    ad4 *= -1;

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
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Output.points[7][7] += fd1;
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Output.points[7][8] -= fd1;
    fb1 = !fb0;
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
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
    Thought lo0 = Thought8.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ad4 = ao1.m3();
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ad1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao3.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
if(ao4 != null){
      ao4.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    lb1 = ad3 > ad4;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    boolean lb2 = false;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought13.getInstance(ab2, ab3, ab4, fb0);
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought2.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
    boolean lb2 = true;
    ab3 = ab4 || fb0;
    double ld3 = 352.3297133430095;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld3, fd0, fd1, fb1, lb2, ab1, ab2);
}
    ab3 = ld3 < fd0;
    Output.points[8][0] += fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld3);
}
    fd0 *= -1;
    fd1 = ld3 + fd0;
    double ld4 = 166.4305078338222;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb2);
}
    ab1 = !ab2;
    Output.points[8][1] -= fd1;
    ld3 *= -1;
if(ao1 != null){
      ao1.m1(ab3, ab4, fb0, fb1);
}
    lb2 = ld4 < fd0;

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
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb0 = false;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ab2 = ao2.m2();
}
    boolean lb1 = true;
    ab2 = ab3 && ab4;
    Output.points[8][2] += ad3;
    double ld2 = 844.9167571030849;
    fb0 = ad3 > ad4;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb0 = fd1 < fd0;
    Thought lo0 = Thought4.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    Output.points[8][3] -= fd1;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[8][4] -= fd0;
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    boolean lb1 = true;
    lb1 = fd1 > fd0;
    double ld2 = 27.098333495311287;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb0, fb1, lb1, fb0);
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
        fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
if(fo0 != null){
      ab2 = fo0.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    if (lb0) {
        double ld2 = 857.6046623934257;
        ld2 = fd0 + fd1;
        lb1 = ab1 || ab2;
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
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
    fb1 = !fb0;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb0 = true;
    double ld1 = 870.8156518158025;
    ld1 = ad1 + ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ld1 = ad1 + ad2;
if(fo1 != null){
      fb0 = fo1.m2();
}
        Thought lo2 = Thought18.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab1 = ad1 > ad2;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m1(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
    ab1 = ab2 || ab3;
    double ld0 = 732.7111064633764;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought4.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, ab1);
}
    Thought lo2 = Thought8.getInstance(ad1, ad2, ad3, ad4);
    boolean lb3 = true;
    if (ab1) {
        ab2 = fd0 > fd1;
        ab3 = ab4 || fb0;
        fb1 = lb3 || ab1;
        boolean lb4 = true;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        ad4 = fd0 + fd1;
        fb0 = ld0 > ad1;
        fb1 = lb4 && lb3;
if(fo0 != null){
          ab1 = fo0.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
        fb1 = ld0 > ad1;
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
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    boolean lb1 = true;
    Output.points[8][5] += fd1;
    Thought lo2 = Thought0.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    lb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    double ld3 = 370.74128301995563;
    boolean lb4 = true;
    boolean lb5 = true;
    double ld6 = 941.3295746563616;
    double ld7 = 625.0168002635414;
    boolean lb8 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, lb1, lb4, lb5);
}
if(ao2 != null){
      ao1 = ao2.m4(lb8, fb0, fb1, lb0);
}
    ld3 = ld6 + ld7;
    Output.points[8][6] += fd0;
    boolean lb9 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld3, ld6, ld7);
}
    boolean lb10 = false;
    boolean lb11 = true;
    Thought lo12 = Thought4.getInstance(fo0, fo1, ao1, ao2);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ld6, lb1, lb4, lb5, lb8);
}

Thought.STACK_COUNTER++;
return ld7;
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
    Thought lo0 = Thought14.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 988.1584859969252;
    if (fb1) {
        fb0 = !fb1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1);
}
        ad2 = ad3 - ad4;
if(ao1 != null){
          fo1 = ao1.m4();
}
        fd0 = fd1 + ld1;
        double ld2 = 486.58068824171113;
        Thought lo3 = Thought13.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
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
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    lb0 = fd1 > fd0;
    ab1 = !ab2;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
if(ao2 != null){
          ao2.m3(ab3, ab4, fb0, fb1);
}
        lb0 = ab1 || ab2;
        double ld1 = 951.4716371641977;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld1, fd0);
}
        }
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m2();
}
    fb0 = fd0 > fd1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld2 = 143.62186374167496;
    fb1 = ld2 > fd0;

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
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    fd1 = ad1 - ad2;
    ab1 = ab2 && ab3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld0 = 410.4333458957896;
    boolean lb1 = false;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
    if (lb1) {
        Thought lo2 = Thought19.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2);
}
        ad3 = ad4 - fd0;
        } else if (fb1) {
        for(int i0=0; i0<10; i0++){
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = false;
    Output.points[8][7] += fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    lb0 = !fb0;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !lb0;
    Thought lo1 = Thought18.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought19.getInstance();

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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought15.getInstance(fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    double ld1 = 145.27784456118084;
    Output.points[8][8] -= ld1;
    Output.points[0][0] += fd0;
    Thought lo2 = Thought3.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
    ab4 = fd1 < ld1;
    boolean lb3 = true;

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
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, fb0, fb1);
}
    double ld0 = 854.1580240791485;
    Output.points[0][1] += ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
        fb0 = ld0 > ad1;
        fb1 = ad2 < ad3;
        fb0 = fb1 || fb0;
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought12.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    Output.points[0][2] -= ad3;
    ad4 = fd0 + fd1;
    Thought lo2 = Thought8.getInstance();
    ad1 = ad2 + ad3;
    fb0 = !fb1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
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
    fb1 = fd0 > fd1;
    if (fb0) {
        fb1 = fd0 < fd1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
        double ld0 = 916.3754236345993;
        double ld1 = 148.97137944073623;
        boolean lb2 = false;
        Output.points[0][3] -= ld0;
        Thought lo3 = Thought7.getInstance(ao3, ao4, fo0, fo1);
        boolean lb4 = true;
        lb2 = lb4 || fb0;
        fb1 = lb2 || lb4;
        boolean lb5 = false;
        Output.points[0][4] -= ld1;
        lb5 = !fb0;
        Thought lo6 = Thought14.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld1, fb1, lb2, lb4, lb5);
        fd0 *= -1;
        fd1 = ld0 - ld1;
        double ld7 = 392.4586195346646;
        ld7 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, ld1, ld7, fb0, fb1, lb2, lb4);
}
        lb5 = fd0 > fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 = ad2 + ad3;
    fb1 = fb0 && fb1;
    fb0 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 + ad4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    fb0 = fd0 > fd1;
if(ao1 != null){
      fb1 = ao1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
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
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 817.4010634137163;
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
    ab2 = ld0 < fd0;
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1);
}
    double ld2 = 988.675304279011;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 > ld2;

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
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 && ab1;
    Thought lo0 = Thought17.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
    boolean lb1 = true;
    Thought lo2 = Thought16.getInstance(fb0, fb1, lb1, ab1);
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ab2 = ao2.m2(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought6.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    double ld2 = 786.1404036436123;
    double ld3 = 353.182540274317;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld4 = 79.04581755380082;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld3, ld4, fd0);
}
    Thought lo5 = Thought0.getInstance(fo1, fo0, fo1, fo0);
    Thought lo6 = Thought17.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, ld3, ld4, fb1, lb0, fb0, fb1);
    double ld7 = 698.6013748502326;
if(fo0 != null){
      fo1 = fo0.m4(ld7, fd0, fd1, ld2, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld4, ld7, fd0);
}
    lb0 = fd1 > ld2;
    fb0 = fb1 || lb0;
    fb0 = !fb1;
    double ld8 = 177.22645452785954;
if(fo1 != null){
      fo1.m2();
}
    ld3 *= -1;
    lb0 = ld4 < ld7;

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
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        boolean lb1 = true;
    lb1 = fb0 && fb1;
    Output.points[0][5] += fd1;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought17.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    fb0 = fd1 < fd0;
if(fo1 != null){
              fb1 = fo1.m2(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    double ld2 = 309.04682106871263;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
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
