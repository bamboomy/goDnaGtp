package genetic;
import java.util.ArrayList;
class Thought70 extends Thought{
private static ArrayList<Thought70> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 800.9705320336377;
private double fd1 = 817.2290941406465;
private Thought fo0 = null;
private Thought fo1 = null;
Thought70 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought70 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought70 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought70 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought70 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought70 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought70 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought70 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought70 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought91.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    fb0 = !fb1;
if(fo1 != null){
      lb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
    Output.points[6][5] += fd1;
    fb0 = fb1 && lb1;
    lb2 = fb0 || fb1;
    fd0 = fd1 + fd0;
    lb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        Output.points[6][6] -= fd1;
        Output.points[6][7] -= fd0;
if(fo0 != null){
          fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
        lb2 = fb0 && fb1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              lb1 = fo0.m2(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
              fo1 = fo0.m4();
}
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
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab2 = !ab3;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        }
        boolean lb2 = true;
    Output.points[6][8] -= fd1;
    lb2 = ab1 || ab2;
    if (ab3) {
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
        lb3 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        Output.points[7][0] -= fd1;
        Thought lo4 = Thought77.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb2, ab1, ab2);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + ad1;
    double ld1 = 773.8864694900931;
    fb0 = !fb1;
    lb0 = !fb0;
if(fo0 != null){
      ad1 = fo0.m3();
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
      fo1.m3(ad1, ad2, ad3, ad4);
}
    ab1 = ab2 && ab3;
    Thought lo0 = Thought56.getInstance(ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought70.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
    fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    Thought lo2 = Thought10.getInstance();
    boolean lb3 = false;
    ad4 = fd0 + fd1;
    boolean lb4 = false;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    lb4 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, lb3, lb4, ab1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo5 = Thought73.getInstance(fo1, fo0, fo1, fo0);
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, lb3, lb4, ab1);
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
    lb0 = !fb0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
    Output.points[7][1] -= fd1;
    Thought lo1 = Thought72.getInstance(fb1, lb0, fb0, fb1);
    lb0 = fd0 < fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
        boolean lb1 = true;
        lb0 = fb0 || fb1;
        }
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    lb0 = fd1 < ad1;
        boolean lb2 = false;
    double ld3 = 769.9045810777051;
    Thought lo4 = Thought15.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
    boolean lb5 = false;
    double ld6 = 799.6292755224546;

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
    boolean lb0 = true;
    boolean lb1 = false;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
        boolean lb2 = true;
    lb1 = lb2 || ab1;
    Thought lo3 = Thought87.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m1();
}
    Thought lo4 = Thought34.getInstance(fd0, fd1, fd0, fd1);
    Thought lo5 = Thought90.getInstance(fb1, lb0, lb1, lb2);
    ab1 = fd0 > fd1;

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
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        ab1 = fd0 > fd1;
    double ld0 = 78.04017467063821;
    boolean lb1 = true;
    ld0 = ad1 - ad2;
    ab1 = ad3 > ad4;
    ab2 = fd0 < fd1;
    Thought lo2 = Thought75.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    ad4 = fd0 + fd1;
    lb1 = !ab1;
    ld0 = ad1 - ad2;
    ab2 = !ab3;
    Thought lo3 = Thought43.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
    ab1 = ad3 < ad4;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab2 = !ab3;

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
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 970.3062126527017;
    Output.points[7][2] -= ld1;
    if (fb1) {
        fd0 = fd1 + ld1;
        lb0 = fb0 && fb1;
        boolean lb2 = false;
        lb2 = fd0 < fd1;
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
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        }
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
    boolean lb0 = true;
    boolean lb1 = true;
    ab1 = fd0 < fd1;
    boolean lb2 = true;
    boolean lb3 = false;
    lb3 = fd0 > fd1;
    double ld4 = 182.7231362888868;
    ld4 *= -1;
    ab1 = ab2 || ab3;
    Thought lo5 = Thought81.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    double ld6 = 238.49014871674424;
    lb1 = ld4 < ld6;
if(fo0 != null){
      lb2 = fo0.m2();
}
    lb3 = ab1 && ab2;
    fd0 = fd1 - ld4;
    boolean lb7 = false;
    ab2 = ab3 || ab4;
    double ld8 = 677.6324192337187;

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
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
        lb0 = !fb0;
    fd0 = fd1 + ad1;
    Output.points[7][3] -= ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    if (lb0) {
        fb0 = ad1 < ad2;
        ad3 *= -1;
        } else if (fb1) {
        double ld1 = 480.40841837350877;
        Thought lo2 = Thought58.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
        ad4 = fd0 - fd1;
        fb0 = ld1 < ad1;
if(fo1 != null){
          fo1.m1(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3();
}
if(fo1 != null){
          fo1.m2(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
          ad4 = fo0.m3(lb0, fb0, fb1, lb0);
}
        fb0 = fb1 || lb0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
        fb1 = lb0 && fb0;
        Thought lo3 = Thought73.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
        boolean lb4 = false;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought15.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb1, ab1, ab2);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    fb1 = ad1 < ad2;
    lb1 = ab1 || ab2;
    boolean lb2 = false;
    ad3 = ad4 - fd0;
    if (ab2) {
        fd1 = ad1 - ad2;
        boolean lb3 = true;
        Thought lo4 = Thought69.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
        Output.points[7][4] -= ad1;
        double ld5 = 291.22538649647504;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, lb3, lb1, lb2);
}
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
    boolean lb0 = false;
        fd1 *= -1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    boolean lb2 = false;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(lb0, lb1, lb2, lb3);
}
    boolean lb4 = true;
    double ld5 = 206.62881122080748;
    boolean lb6 = false;
    boolean lb7 = true;
    ld5 = fd0 + fd1;
if(fo1 != null){
      lb4 = fo1.m2(ao1, ao2, ao3, ao4, ld5, fd0, fd1, ld5);
}
    boolean lb8 = false;
    boolean lb9 = false;
    Thought lo10 = Thought23.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld5, fd0, lb6, lb7, lb8, lb9);
    boolean lb11 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb11, fb0, fb1, lb0);
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
    Thought lo0 = Thought76.getInstance(ao1, ao2, ao3, ao4);
    ad1 = ad2 + ad3;
    fb0 = fb1 && fb0;
    fb1 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ao4.m2(fb0, fb1, fb0, fb1);
}
    double ld1 = 309.9421849493735;
    ad1 = ad2 - ad3;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1);
}
    ad1 = ad2 + ad3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[7][5] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ab4 = !fb0;
        fd0 *= -1;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[7][6] -= fd0;
    fb0 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        boolean lb1 = true;
        fb0 = fd0 > fd1;
        Output.points[7][7] -= fd0;
if(ao1 != null){
          fb1 = ao1.m2();
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ab2 = ao4.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ad3 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
    ab1 = ad4 < fd0;
    Output.points[7][8] -= fd1;
    Output.points[8][0] += ad1;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb1 = true;
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    ad2 *= -1;
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;
    boolean lb2 = false;
    Thought lo3 = Thought91.getInstance();
if(ao4 != null){
      ao4.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      lb0 = fo0.m2(lb1, lb2, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Thought lo4 = Thought72.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb2);
}
    Thought lo5 = Thought53.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
    ad1 = ad2 - ad3;
    boolean lb6 = false;

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
    boolean lb0 = true;
    Thought lo1 = Thought31.getInstance(fo0, fo1, fo0, fo1);
    lb0 = fd1 < fd0;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    Thought lo2 = Thought98.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb0;
    boolean lb3 = true;
    boolean lb4 = true;
    double ld5 = 260.24626031795697;
if(fo0 != null){
      lb3 = fo0.m2(lb4, fb0, fb1, lb0);
}
    lb3 = !lb4;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld5);
}
    boolean lb6 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0, fb0, fb1, lb0, lb3);
}
    lb4 = !lb6;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, ld5, fd0, fd1, lb4, lb6, fb0, fb1);
}

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
    fd0 *= -1;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    lb1 = !ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    if (lb0) {
        boolean lb2 = false;
        lb0 = !lb1;
        fd0 = fd1 + fd0;
        ab1 = ab2 && ab3;
        fd1 = fd0 - fd1;
        ab4 = fd0 < fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        boolean lb3 = true;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
        double ld4 = 445.48010633522597;
        lb3 = lb0 && lb1;
        Thought lo5 = Thought34.getInstance(fo0, fo1, fo0, fo1);
        Thought lo6 = Thought32.getInstance(ld4, fd0, fd1, ld4, ab1, ab2, ab3, ab4);
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
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    double ld0 = 774.1649737519652;
    Output.points[8][1] += ld0;
    ad1 = ad2 - ad3;
    boolean lb1 = false;
    Output.points[8][2] += ad4;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(fd1, ld0, ad1, ad2);
}
    boolean lb2 = false;
if(fo0 != null){
      lb1 = fo0.m2(lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, lb1, lb2);
}
    Thought lo3 = Thought23.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
    ad4 = fd0 - fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1);
}
    fb1 = !lb1;
    lb2 = ad2 < ad3;
    fb0 = fb1 || lb1;
    double ld4 = 864.1405900854259;
    ad3 = ad4 + fd0;
if(fo0 != null){
      lb2 = fo0.m2(fb0, fb1, lb1, lb2);
}
    fd1 *= -1;
    fb0 = fb1 && lb1;
    lb2 = fb0 && fb1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad2 = ad3 + ad4;
    ab1 = !ab2;
    ab3 = fd0 > fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || ab1;
        ad4 = fd0 + fd1;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = ad1 + ad2;
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
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3();
}
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
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
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
    Output.points[8][3] += fd1;
    boolean lb2 = false;
    boolean lb3 = false;
    boolean lb4 = false;
    ad1 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, lb0, lb1, lb2, lb3);
}
    boolean lb5 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb4, lb5, fb0, fb1);
}
    Thought lo6 = Thought25.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, lb0, lb1, lb2, lb3);
}
    lb4 = !lb5;
if(ao3 != null){
      fb0 = ao3.m2();
}
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, lb2);
}
    Output.points[8][4] += ad3;
    ad4 *= -1;
    double ld7 = 921.6684727073441;
    Output.points[8][5] -= ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld7, ad1);
}
    lb3 = ad2 < ad3;

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
    boolean lb0 = false;
        Output.points[8][6] -= fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    Output.points[8][7] += ad1;
    ad2 *= -1;
    ab3 = !ab4;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    Thought lo1 = Thought43.getInstance(lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    boolean lb2 = false;
    lb0 = lb2 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
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
        Output.points[8][8] -= fd1;
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought42.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
    Output.points[0][0] += fd0;
    Thought lo1 = Thought22.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    ad4 *= -1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
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
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1();
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 - ad2;
    Thought lo1 = Thought72.getInstance(fo1, fo0, fo1, fo0);
    lb0 = ad3 < ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    ad3 = ad4 - fd0;
    ab4 = fb0 && fb1;
    fd1 = ad1 - ad2;
    boolean lb3 = true;
    ad3 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, lb2, lb3, lb4, ab1);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ab2 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo1.m3(fb1, lb0, lb2, lb3);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
    boolean lb5 = true;
    lb4 = !lb5;
    double ld6 = 593.0690918232455;
if(fo1 != null){
      ab1 = fo1.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
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
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    lb0 = !fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = !lb0;
    Output.points[0][1] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[0][2] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    lb0 = fb0 || fb1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    double ld2 = 943.499806598293;
        lb0 = lb1 && fb0;
    double ld3 = 150.60707188587477;
    ld2 *= -1;
    fb1 = lb0 && lb1;
if(ao2 != null){
      ao2.m3(fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        lb0 = !lb1;
if(ao3 != null){
          fb0 = ao3.m2();
}
if(ao4 != null){
          fb1 = ao4.m2(ld3, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought68.getInstance(ao2, ao3, ao4, fo0);
    ad2 *= -1;
    fb0 = ad3 > ad4;
    Output.points[0][3] += fd0;
    fd1 = ad1 - ad2;
    Output.points[0][4] += ad3;
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    Output.points[0][5] -= ad4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;

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
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    lb1 = ab1 || ab2;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought49.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    double ld3 = 2.558849038906476;
    ld3 = fd0 - fd1;

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
    ad1 *= -1;
    ab1 = !ab2;
    ad2 *= -1;
    ad3 *= -1;
if(ao1 != null){
      ad4 = ao1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    fd0 = fd1 - ad1;
    Output.points[0][6] -= ad2;
    ad3 = ad4 + fd0;
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    fd1 *= -1;
if(ao2 != null){
      ao2.m2();
}
    ab3 = ab4 && fb0;
    Output.points[0][7] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    fd1 = ad1 + ad2;
    ab4 = ad3 < ad4;
    Thought lo0 = Thought64.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
    Thought lo1 = Thought5.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    double ld2 = 494.14203036207095;

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
    double ld0 = 731.157408591175;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fd0 > fd1;
    fb0 = ld0 > fd0;
    fb1 = fd1 > ld0;
    lb1 = fd0 > fd1;
    Thought lo2 = Thought39.getInstance();
    Thought lo3 = Thought37.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    lb1 = fd1 > ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    fb1 = lb1 || fb0;
    fd1 = ld0 - fd0;
    Thought lo4 = Thought81.getInstance(fd1, ld0, fd0, fd1);
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb1 = !lb1;
        Thought lo5 = Thought92.getInstance(fb0, fb1, lb1, fb0);
    Thought lo6 = Thought3.getInstance();
    fb1 = !lb1;
    Thought lo7 = Thought6.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
        fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 855.0489782917143;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    Output.points[0][8] += fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo0 != null){
      ld0 = fo0.m3();
}
    Output.points[1][0] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb1 = true;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 598.3524403112525;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld1 = 431.7417439754935;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = !fb1;
    fb0 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought26.getInstance(ld1, fd0, fd1, ld0);
    Thought lo3 = Thought89.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, lb4, fb0, fb1, lb4);
}
    fb0 = !fb1;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    boolean lb5 = true;
    lb4 = !lb5;

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
