package genetic;
import java.util.ArrayList;
class Thought15 extends Thought{
private static ArrayList<Thought15> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 854.1256210122791;
private double fd1 = 402.08163417417336;
private Thought fo0 = null;
private Thought fo1 = null;
Thought15 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought15 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought15 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought15 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought15 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought15 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought15 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought15 instance = new Thought15 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    lb0 = fd0 > fd1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb1 = lb0 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1();
}
    double ld2 = 7.632745767417893;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    double ld3 = 850.1118655895624;
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    ld2 = ld3 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld2, ld3, fd0, fd1);
}
    fb1 = lb0 && lb1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ld2 = ld3 - fd0;
    boolean lb4 = false;
    boolean lb5 = true;
    fd1 *= -1;
    lb5 = ld2 > ld3;

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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
        Thought lo1 = Thought0.getInstance(lb0, fb0, fb1, lb0);
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    lb2 = !fb0;

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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    ad1 = ad2 + ad3;
    double ld2 = 184.1823394580083;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(ld2, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    ab1 = !ab2;
    Thought lo3 = Thought18.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2);
    boolean lb4 = false;
    Thought lo5 = Thought19.getInstance();
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    if (lb0) {
        lb1 = !lb4;
        ad1 = ad2 - ad3;
        ab1 = ab2 && ab3;
        ab4 = !fb0;
        fb1 = lb0 || lb1;
        lb4 = ad4 < fd0;
if(fo0 != null){
          fo0.m2(ab1, ab2, ab3, ab4);
}
        if (fb0) {
            double ld6 = 328.7420231957948;
if(fo1 != null){
              fb1 = fo1.m2(fd0, fd1, ld6, ld2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2();
}
    Output.points[5][3] -= fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    fb1 = fd1 < fd0;
if(ao4 != null){
      lb0 = ao4.m2(fd1, fd0, fd1, fd0);
}
    double ld1 = 745.0530855301696;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 && lb0;
    Output.points[5][4] -= fd0;
    double ld2 = 867.2556548620367;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld2, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    ld1 = ld2 - fd0;
    lb0 = fb0 && fb1;

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
    fb0 = ad2 > ad3;
    Thought lo0 = Thought5.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    ad2 *= -1;
    double ld1 = 814.9853780448648;
    double ld2 = 59.340774264822464;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
if(ao2 != null){
          fd0 = ao2.m3();
}
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao2.m1(fb0, fb1, fb0, fb1);
}
        Thought lo3 = Thought0.getInstance(fd1, ld1, ld2, ad1);
        ad2 = ad3 - ad4;
        fb0 = fd0 > fd1;
        ld1 = ld2 + ad1;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          ld1 = ao1.m3(ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        ad4 = fd0 + fd1;
        }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, ld2, ad1, ad2);
}
if(ao2 != null){
      ao2.m2();
}
    boolean lb4 = false;
    lb4 = fb0 && fb1;
    lb4 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb4, fb0, fb1, lb4);
}
    ad3 *= -1;
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
if(ao1 != null){
      ao1.m1(ab2, ab3, ab4, fb0);
}
    Output.points[5][5] -= fd1;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
    fb1 = ab1 && ab2;
    fd0 *= -1;
    ab3 = fd1 < fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought5.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
    fd0 = fd1 + fd0;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fb1 || lb1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld2 = 442.72890040976756;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao2 != null){
      fd0 = ao2.m3(lb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought11.getInstance(fd1, ld2, fd0, fd1);
    Output.points[5][6] += ld2;
    ab4 = fd0 > fd1;
    Thought lo4 = Thought11.getInstance(ao3, ao4, fo0, fo1);
    fb0 = fb1 && lb1;
    ld2 = fd0 + fd1;
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    Thought lo0 = Thought10.getInstance(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 151.39804403234092;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought0.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = ld0 > fd0;
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1);
}
    fb1 = fb0 && fb1;
    if (fb0) {
        Thought lo2 = Thought12.getInstance(fo0, fo1, fo0, fo1);
        boolean lb3 = true;
        Output.points[5][7] += ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb3, fb0);
}
        for(int i0=0; i0<10; i0++){
            double ld4 = 51.424545557942054;
if(fo0 != null){
              fd0 = fo0.m3(fd1, ld4, ld0, fd0, fb1, lb3, fb0, fb1);
}
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, fd1, ld4, ld0, fd0);
}
            Thought lo5 = Thought14.getInstance();
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
              fo1.m3(fb0, fb1, lb3, fb0);
}
            ld4 *= -1;
            boolean lb6 = false;
            Output.points[5][8] -= ld0;
if(fo0 != null){
              fo0.m3(fd0, fd1, ld4, ld0);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    Output.points[6][0] -= fd1;
    Thought lo0 = Thought15.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought17.getInstance(fd1, fd0, fd1, fd0);
    boolean lb2 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought6.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
        double ld2 = 353.3289755349313;
        Thought lo3 = Thought1.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
        ld2 *= -1;
if(fo1 != null){
          fb1 = fo1.m2();
}
        lb1 = ad1 < ad2;
        boolean lb4 = true;
        boolean lb5 = true;
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
    ab1 = ad2 > ad3;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    Thought lo0 = Thought4.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    boolean lb1 = true;
    ad4 *= -1;
    Output.points[6][1] -= fd0;
    fd1 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb1, lb2, ab1, ab2);
}
if(fo1 != null){
          fo1.m1(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    Output.points[6][2] += fd1;
    fd0 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = fd1 < fd0;
        fd1 = fd0 + fd1;
    boolean lb1 = true;

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
    boolean lb0 = true;
    lb0 = ad1 > ad2;
    ad3 *= -1;
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fd0 > fd1;
    fb1 = ad1 > ad2;
    lb0 = ad3 > ad4;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought9.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
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
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ab3 = ao2.m2(fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
    fd1 *= -1;
    lb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought18.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    ad1 = ad2 - ad3;
    ab1 = ad4 > fd0;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
    Output.points[6][3] -= fd1;
    fb0 = ad1 < ad2;
    fb1 = ab1 && ab2;
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1);
}
    ab3 = ad1 < ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        boolean lb0 = false;
        Output.points[6][4] += fd1;
        boolean lb1 = false;
        double ld2 = 464.43301966407097;
if(fo0 != null){
          fo1 = fo0.m4(ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
        lb1 = !fb0;
        fb1 = fd1 > ld2;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Output.points[6][5] -= fd0;
        Output.points[6][6] -= fd1;
        lb0 = ld2 > fd0;
        lb1 = !fb0;
        double ld3 = 759.1243600329458;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
}
        if (lb0) {
if(fo0 != null){
              fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ld2, ld3);
}
            lb1 = !fb0;
            boolean lb4 = true;
            fd0 = fd1 - ld2;
            if (fb0) {
                Output.points[6][7] -= ld3;
                fb1 = lb4 || lb0;
if(fo1 != null){
                  fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
                fd1 *= -1;
}}}
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
    ab1 = ab2 || ab3;
    ab4 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
    ab4 = !fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Output.points[6][8] += ad1;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    lb0 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb1 = lb0 && lb1;
    fb0 = fd1 < ad1;
    Thought lo2 = Thought5.getInstance(fo0, fo1, fo0, fo1);
    fb1 = !lb0;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    double ld3 = 91.98712974545556;
    Output.points[7][0] -= ld3;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    Thought lo4 = Thought12.getInstance(ld3, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
    lb1 = fb0 || fb1;

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
    Thought lo0 = Thought5.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    Thought lo1 = Thought16.getInstance();
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Output.points[7][1] += fd1;
if(fo1 != null){
      fo1.m2(fb1, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    ab4 = fb0 && fb1;
    Thought lo2 = Thought14.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 - fd0;
    ab1 = fd1 > ad1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ad1;
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3(fb1, ab1, ab2, ab3);
}
    Output.points[7][2] -= ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought17.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Thought lo1 = Thought13.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Output.points[7][3] -= ad2;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    Thought lo0 = Thought9.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    ad3 *= -1;
    if (fb0) {
        Thought lo1 = Thought3.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
        ad2 = ad3 + ad4;
        fd0 *= -1;
        double ld2 = 262.9687649290639;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 = fd1 + fd0;
    ab2 = fd1 < fd0;
if(ao1 != null){
      ab3 = ao1.m2();
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    ab4 = fd1 > fd0;
    fb0 = fd1 > fd0;
    fb1 = ab1 || ab2;
    boolean lb0 = false;
    Thought lo1 = Thought9.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    fb1 = lb0 && ab1;
    Thought lo2 = Thought9.getInstance(ab2, ab3, ab4, fb0);
    boolean lb3 = false;

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
    boolean lb0 = true;
    lb0 = !ab1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        Output.points[7][4] -= fd0;
        ab2 = fd1 > ad1;
        ad2 = ad3 + ad4;
        ab3 = !ab4;
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
        fb0 = fb1 && lb0;
        fd1 = ad1 + ad2;
        Thought lo1 = Thought2.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
        Thought lo2 = Thought4.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
        Output.points[7][5] += fd0;
        double ld3 = 155.82963734065274;
        ab2 = !ab3;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    Output.points[7][6] += fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought14.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld2 = 88.77588318096407;
    fb1 = fd0 > fd1;
    boolean lb3 = false;
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, lb0, lb3, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ld2, fd0, lb3, fb0, fb1, lb0);
}
    lb3 = fd1 > ld2;

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
    ab1 = ab2 && ab3;
    Output.points[7][7] += fd1;
    Thought lo0 = Thought6.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb1 = ab1 || ab2;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    Thought lo3 = Thought3.getInstance(fd0, fd1, fd0, fd1);
    Output.points[7][8] += fd0;
    boolean lb4 = false;
    fd1 = fd0 + fd1;
    Thought lo5 = Thought18.getInstance(fo0, fo1, fo0, fo1);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, lb4, ab1);
}
    fd0 *= -1;
    ab2 = ab3 || ab4;
    double ld6 = 878.311710906236;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld6, fd0, fb0, fb1, lb1, lb2);
}
    Output.points[8][0] += fd1;
if(fo0 != null){
      ld6 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld6, fd0);
}
    double ld7 = 849.0422790153019;
    fd0 = fd1 + ld6;

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
    fb0 = ad2 < ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    double ld1 = 517.6533783140251;
    boolean lb2 = true;
    lb0 = ld1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
    lb2 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, lb2, fb0, fb1);
}
    fd1 = ld1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb0, lb2, fb0, fb1);
}
    lb0 = lb2 || fb0;
    Thought lo3 = Thought2.getInstance(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
    Thought lo4 = Thought17.getInstance();
    boolean lb5 = true;
    Output.points[8][1] += ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
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
    ab1 = !ab2;
    double ld0 = 830.0992243039684;
    ab3 = ab4 && fb0;
    boolean lb1 = false;
    ld0 *= -1;
    Thought lo2 = Thought19.getInstance(fb0, fb1, lb1, ab1);
    Thought lo3 = Thought14.getInstance(ad1, ad2, ad3, ad4);
    ab2 = !ab3;
    ab4 = fd0 < fd1;
    ld0 = ad1 - ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    double ld4 = 70.15829341819929;
    ld0 *= -1;
    boolean lb5 = true;
    double ld6 = 734.9795293342171;
        boolean lb7 = false;
if(fo1 != null){
      fo1.m2(ld4, ld6, ad1, ad2, lb7, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
        ld4 = ld6 - ad1;
        double ld8 = 307.9147347812624;
if(fo1 != null){
          ad1 = fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb5, lb7);
}
        ab1 = ab2 && ab3;
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
if(ao2 != null){
      ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb0 = false;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    double ld1 = 686.3996573366255;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought2.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
    fb0 = !fb1;
if(ao3 != null){
      fd1 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
    double ld3 = 457.02282779564996;
    Thought lo4 = Thought18.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      ao4 = fo0.m4(ld1, ld3, fd0, fd1);
}
        Thought lo5 = Thought17.getInstance(fo1, ao1, ao2, ao3);
    boolean lb6 = false;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld1, ld3, fd0, fd1, fb0, fb1, lb0, lb6);
}
    boolean lb7 = false;
if(ao3 != null){
      ld1 = ao3.m3(ld3, fd0, fd1, ld1, lb7, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld1);
}
if(ao3 != null){
      ao3.m3();
}
    boolean lb8 = true;

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
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fb0 = ad2 < ad3;
if(ao1 != null){
          ao1.m2(fb1, fb0, fb1, fb0);
}
        ad4 = fd0 + fd1;
        Output.points[8][2] -= ad1;
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
        fb1 = fd1 < ad1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        Output.points[8][3] -= ad2;
        boolean lb0 = false;
if(ao4 != null){
          ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
        boolean lb1 = true;
        Thought lo2 = Thought3.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
if(ao4 != null){
          ao3 = ao4.m4();
}
        boolean lb3 = true;
        lb3 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb0, lb1, lb3);
}
        Output.points[8][4] -= ad4;
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb0, lb1, lb3);
}
        double ld4 = 114.57715011078244;
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ld4);
}
        ad1 = ad2 - ad3;
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
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ab2 = ao4.m2(fd0, fd1, fd0, fd1);
}
        Thought lo0 = Thought7.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
          ao4.m3();
}
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
        ab3 = fd0 > fd1;
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
    Output.points[8][5] -= ad1;
    ab2 = ad2 < ad3;
    Thought lo0 = Thought18.getInstance(ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    ab4 = ad4 > fd0;
if(ao1 != null){
      fb0 = ao1.m2(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 = fd1 - ad1;
    boolean lb1 = false;
    ad2 *= -1;
    fb0 = fb1 || lb1;
    Output.points[8][6] -= ad3;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo2 = Thought12.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, fb0, fb1, lb1, ab1);
    double ld3 = 799.4291048264278;
    ab2 = ab3 && ab4;
    Output.points[8][7] -= ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, ad1, fb0, fb1, lb1, ab1);
}
        boolean lb4 = true;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
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
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    Output.points[8][8] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    double ld1 = 454.7002111256186;
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought3.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo1 = Thought11.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
        boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2();
}
    double ld0 = 180.27587011556136;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought3.getInstance(ld0, fd0, fd1, ld0);
    Thought lo2 = Thought4.getInstance(fo1, fo0, fo1, fo0);
    Thought lo3 = Thought13.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;
    Thought lo4 = Thought19.getInstance();
    Output.points[0][0] -= fd0;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb5 = true;
    double ld6 = 816.8022617375161;
    fd0 = fd1 - ld0;
    Output.points[0][1] += ld6;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb5, fb0);
}
    boolean lb7 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld6);
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
