package genetic;
import java.util.ArrayList;
class Thought62 extends Thought{
private static ArrayList<Thought62> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 603.4983677479819;
private double fd1 = 983.7952961032597;
private Thought fo0 = null;
private Thought fo1 = null;
Thought62 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought62 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought62 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought62 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought62 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought62 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought62 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought62 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought62 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought62 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought62 instance = new Thought62 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    Output.points[0][7] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought30.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
    Thought lo2 = Thought68.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;
if(fo1 != null){
      fd1 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[0][8] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb3, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, lb0, lb3, ab1, ab2);
}
        ab3 = ab4 || fb0;
        fb1 = lb0 && lb3;
        Output.points[1][0] += fd1;
        boolean lb4 = false;
        } else if (ab1) {
if(fo1 != null){
          ab2 = fo1.m2(fd0, fd1, fd0, fd1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    Thought lo0 = Thought8.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    Output.points[1][1] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = ad1 > ad2;
    fb0 = ad3 < ad4;

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
    boolean lb0 = false;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 < ad2;
    boolean lb1 = true;
    lb0 = !lb1;
    Thought lo2 = Thought85.getInstance(ad3, ad4, fd0, fd1);
    double ld3 = 107.50388451969046;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 = fd0 - fd1;
    ld3 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4, fb1, lb0, lb1, ab1);
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    lb0 = fd1 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb1, lb2, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    if (lb0) {
        fd0 *= -1;
        lb1 = lb2 && fb0;
        fd1 *= -1;
        Thought lo3 = Thought10.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
          fb1 = fo1.m2(lb0, lb1, lb2, fb0);
}
        fb1 = !lb0;
        Thought lo4 = Thought29.getInstance();
        fd0 *= -1;
        lb1 = lb2 && fb0;
if(ao1 != null){
          fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = ad2 < ad3;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 < ad3;
    double ld0 = 612.7664947226444;
    double ld1 = 520.9780635319468;
    ad2 = ad3 - ad4;
    boolean lb2 = true;
    double ld3 = 919.1602675521189;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ld3, ad1, ad2);
}
    double ld4 = 426.87998754145843;
    double ld5 = 668.7693942357469;

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
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    ab4 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    fd0 *= -1;
    Thought lo1 = Thought65.getInstance(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    ab4 = fd1 > fd0;
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    ab4 = !fb0;
    fb1 = lb0 && lb2;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
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
    double ld0 = 593.8346619485886;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb1, ab1, ab2, ab3);
}
    ab4 = ld0 > ad1;
    boolean lb2 = false;
    Thought lo3 = Thought19.getInstance();
    double ld4 = 768.4196367700525;
    Thought lo5 = Thought37.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
    boolean lb6 = true;
    double ld7 = 507.6278327404612;
    boolean lb8 = true;
    lb2 = lb6 && lb8;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    double ld9 = 541.380085722452;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb1, lb2, lb6, lb8);
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    if (fb1) {
        double ld0 = 410.8157745913819;
        boolean lb1 = false;
        ld0 = fd0 - fd1;
        ld0 = fd0 + fd1;
        ld0 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
        fd0 = fd1 + ld0;
if(fo0 != null){
          fd0 = fo0.m3(lb1, fb0, fb1, lb1);
}
        Thought lo2 = Thought70.getInstance();
        fb0 = fb1 || lb1;
if(fo1 != null){
          fo1.m2(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
        fb1 = !lb1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = ld0 > fd0;
        fd1 = ld0 - fd0;
        } else if (fb0) {
        fd0 *= -1;
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
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 732.957915414523;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    double ld1 = 23.42322216379211;
    fd0 *= -1;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2();
}
    fd1 *= -1;
    boolean lb2 = true;

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
    double ld0 = 397.13515862637087;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    double ld2 = 176.3222444057731;
    ad3 *= -1;
    ad4 = fd0 - fd1;
    Output.points[1][2] += ld0;
        lb1 = !fb0;
    fb1 = ld2 < ad1;
    boolean lb3 = true;
    lb1 = !lb3;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld0;
    boolean lb4 = false;
    if (lb4) {
        fb0 = !fb1;
        lb1 = ld2 < ad1;
if(fo1 != null){
          lb3 = fo1.m2(ad2, ad3, ad4, fd0);
}
        Thought lo5 = Thought69.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ad1);
if(fo1 != null){
          fo0 = fo1.m4(lb4, fb0, fb1, lb1);
}
        boolean lb6 = false;
if(fo0 != null){
          lb1 = fo0.m2();
}
        ad2 *= -1;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought86.getInstance(fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab3 = ad2 > ad3;
    ab4 = ad4 > fd0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = ad1 > ad2;
    ad3 *= -1;
    boolean lb1 = true;
    ad4 = fd0 + fd1;
        boolean lb2 = true;
    ad1 = ad2 + ad3;

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
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 852.7496011721183;
    fb1 = !fb0;
    boolean lb1 = true;
    Output.points[1][3] += fd0;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld3 = 224.97462702019743;
    lb2 = fb0 || fb1;
    boolean lb4 = true;
    double ld5 = 452.37628077389354;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, ld5, fd0, fd1, ld0, lb2, lb4, fb0, fb1);
}
    lb1 = lb2 && lb4;
    boolean lb6 = true;
    ld3 = ld5 + fd0;
    boolean lb7 = false;
    Thought lo8 = Thought41.getInstance(fo1, ao1, ao2, ao3, lb6, lb7, fb0, fb1);

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
    Thought lo0 = Thought66.getInstance(ad1, ad2, ad3, ad4);
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && lb1;
    ad3 = ad4 + fd0;
    boolean lb2 = true;
    lb2 = fd1 > ad1;
    fb0 = fb1 || lb1;
if(ao2 != null){
      lb2 = ao2.m2(fb0, fb1, lb1, lb2);
}
    fb0 = fb1 && lb1;
if(ao3 != null){
      ad2 = ao3.m3();
}
    lb2 = ad3 < ad4;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb1, lb2, fb0);
}
    fb1 = lb1 && lb2;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb1, lb2, fb0);
}
    boolean lb3 = true;
    ad1 *= -1;
    Thought lo4 = Thought83.getInstance(ad2, ad3, ad4, fd0);
    boolean lb5 = false;
if(ao3 != null){
      lb5 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    fb0 = !fb1;
    boolean lb6 = false;
    lb1 = lb2 || lb3;
    lb5 = ad4 < fd0;
    lb6 = fd1 > ad1;
    fb0 = ad2 < ad3;

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
    Thought lo0 = Thought77.getInstance(ab1, ab2, ab3, ab4);
if(ao3 != null){
          ao2 = ao3.m4();
}
    Output.points[1][4] -= fd1;
    boolean lb1 = true;
    fd0 = fd1 + fd0;
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
    ab2 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    double ld2 = 750.4035138260635;
    double ld3 = 629.3391892884702;
    Thought lo4 = Thought36.getInstance(ld2, ld3, fd0, fd1);
    ab3 = ld2 < ld3;
    ab4 = fb0 && fb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        fd1 = ad1 - ad2;
        Thought lo0 = Thought13.getInstance(ab4, fb0, fb1, ab1);
        ad3 = ad4 - fd0;
if(ao1 != null){
          ao1.m3();
}
        ab2 = fd1 > ad1;
        double ld1 = 378.4466764996851;
        ad1 = ad2 + ad3;
        boolean lb2 = true;
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
        ad1 = ad2 - ad3;
        fb1 = !lb2;
        ab1 = !ab2;
        boolean lb3 = false;
}
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld0 = 687.9381421486253;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
    boolean lb2 = true;
    fd1 = ld0 + fd0;
    lb1 = lb2 && fb0;
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(ld0, fd0, fd1, ld0, lb1, lb2, fb0, fb1);
}
    fd0 = fd1 + ld0;
    lb1 = fd0 < fd1;
    lb2 = !fb0;
    fb1 = ld0 < fd0;
    lb1 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (lb2) {
        fd0 = fd1 + ld0;
        fb0 = fb1 && lb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    Output.points[1][5] += fd0;
    ab1 = fd1 < fd0;
    if (ab2) {
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m1(ab3, ab4, fb0, fb1);
}
        ab1 = fd0 < fd1;
        if (ab2) {
if(fo0 != null){
              fo1 = fo0.m4();
}
            ab3 = ab4 || fb0;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
            fd0 = fd1 - fd0;
            ab4 = fd1 > fd0;
            fd1 = fd0 + fd1;
            fd0 = fd1 - fd0;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1);
}
            fb0 = fd1 < fd0;
            fb1 = !ab1;
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
              fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
            boolean lb0 = true;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
            fd0 = fd1 + fd0;
            } else {
            boolean lb1 = false;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    fb0 = !fb1;
    double ld0 = 729.5323870290524;
    ad3 = ad4 + fd0;
    Thought lo1 = Thought73.getInstance();
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2, lb2, fb0, fb1, lb2);
}
    Thought lo3 = Thought53.getInstance(fo1, fo0, fo1, fo0);
    ad3 = ad4 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb1, lb2, fb0, fb1);
}
    boolean lb4 = false;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, lb2, lb4, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 950.0850083415409;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    boolean lb1 = false;
    lb1 = ab1 && ab2;
    fd1 *= -1;
    ld0 = ad1 - ad2;
    ab3 = !ab4;
    ad3 = ad4 + fd0;
    fd1 = ld0 - ad1;
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        Thought lo2 = Thought63.getInstance(lb1, ab1, ab2, ab3);
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 = ld0 - ad1;
if(fo0 != null){
          ab4 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
}
        boolean lb3 = false;
        fd1 = ld0 - ad1;
        ab1 = ad2 < ad3;
        ab2 = ad4 > fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m3(lb0, lb1, fb0, fb1);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      lb0 = ao4.m2(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    boolean lb2 = false;
    lb1 = fd1 < fd0;
    lb2 = !fb0;
    fb1 = lb0 && lb1;
    lb2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd1 *= -1;
    double ld3 = 531.3246273600982;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 810.7539314337506;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb2 = true;
    double ld3 = 379.01503290608514;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, lb1, lb2, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld3, ad1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[1][6] -= fd0;
    double ld1 = 666.8390491416227;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
    Output.points[1][7] -= ld1;
    fd0 = fd1 + ld1;
    boolean lb2 = true;
    lb0 = lb2 && ab1;
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;
    ld1 = fd0 + fd1;
    fb1 = !lb0;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
if(ao1 != null){
          fo1 = ao1.m4(lb0, lb2, ab1, ab2);
}
        ab3 = ld1 < fd0;
        ab4 = fd1 < ld1;
        boolean lb4 = true;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fd0 = fd1 - ld1;
        ab4 = fd0 < fd1;
        ld1 *= -1;
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
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - ad1;
    ad2 *= -1;
    ab2 = ab3 && ab4;
    double ld0 = 524.0966846162102;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
    fb1 = ab1 && ab2;
        ab3 = ab4 && fb0;
    double ld1 = 493.2626131508109;
    ld0 = ld1 - ad1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ld1, ad1);
}
    Thought lo2 = Thought83.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m3();
}
    boolean lb3 = false;
    fd1 = ld0 - ld1;
    double ld4 = 801.8039048035027;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    boolean lb0 = false;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    if (lb0) {
        lb1 = fb0 && fb1;
        lb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
        lb1 = fd0 > fd1;
        fb0 = fb1 && lb0;
        lb1 = !fb0;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          fd1 = fo0.m3();
}
        ab3 = ab4 || fb0;
        fb1 = ab1 || ab2;
        ab3 = !ab4;
        Thought lo0 = Thought3.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab3 = fd0 < fd1;
        Thought lo1 = Thought26.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
        fd0 *= -1;
        ab2 = fd1 < fd0;
        ab3 = fd1 < fd0;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    double ld1 = 731.3580862916457;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
    fb1 = ad2 < ad3;
    ad4 = fd0 - fd1;
    lb0 = fb0 || fb1;
    boolean lb2 = true;
    Thought lo3 = Thought36.getInstance(lb0, lb2, fb0, fb1);
    lb0 = ld1 < ad1;
    Thought lo4 = Thought73.getInstance();
    lb2 = fb0 && fb1;
    lb0 = lb2 || fb0;
    Output.points[1][8] += ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld1, fb1, lb0, lb2, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 && lb2;
    double ld5 = 708.8201407608535;
if(fo0 != null){
      ld5 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
}
    fb0 = fb1 || lb0;
    boolean lb6 = true;
    Thought lo7 = Thought5.getInstance(fo1, fo0, fo1, fo0, lb2, lb6, fb0, fb1);
    Thought lo8 = Thought37.getInstance(fd0, fd1, ld1, ld5);
    lb0 = lb2 && lb6;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = ab3 && ab4;
    if (fb0) {
if(fo0 != null){
          fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo1.m3();
}
        fd0 = fd1 - ad1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
        ab3 = fd1 < ad1;
        ab4 = ad2 > ad3;
        fb0 = ad4 > fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        fb1 = !ab1;
        fd1 *= -1;
        boolean lb0 = true;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
        fd0 = fd1 - ad1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
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
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought57.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4();
}
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
    double ld1 = 717.9378290249973;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - ld1;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || fb0;
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
        fb0 = ad1 > ad2;
if(fo0 != null){
          fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
        lb0 = fb0 || fb1;
        lb0 = fb0 && fb1;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, ld1, ad1, ad2, ad3);
}
        }
    boolean lb2 = false;
    lb0 = !lb2;
    ad4 *= -1;
    Output.points[2][0] -= fd0;
    fd1 *= -1;
    boolean lb3 = true;
    lb3 = ld1 < ad1;
    Thought lo4 = Thought87.getInstance(fb0, fb1, lb0, lb2);
    boolean lb5 = false;
    boolean lb6 = true;
    ad2 = ad3 - ad4;
    double ld7 = 807.6494032794998;

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
          ao2.m2();
}
    fd1 *= -1;
    fd0 *= -1;
    ab1 = ab2 && ab3;
    boolean lb0 = false;
    ab3 = !ab4;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought55.getInstance(fo0, fo1, ao1, ao2);
    ab4 = !fb0;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Thought lo2 = Thought66.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
    Output.points[2][1] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 < fd1;
    ab3 = !ab4;
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    ab3 = ad1 < ad2;
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad3 = ad4 + fd0;
    Output.points[2][2] -= fd1;
if(ao3 != null){
      ao3.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    fd0 = fd1 + ad1;
    if (ab2) {
        if (ab3) {
            double ld0 = 993.2986866157439;
            ad1 = ad2 + ad3;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
            ad4 = fd0 + fd1;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
            boolean lb1 = true;
            ad4 = fd0 - fd1;
if(ao4 != null){
              ld0 = ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
              ao3.m1(ad1, ad2, ad3, ad4);
}
            Output.points[2][3] += fd0;
if(ao4 != null){
              fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
}
if(ao4 != null){
              ao3 = ao4.m4(fb0, fb1, lb1, ab1);
}
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
          fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    Thought lo2 = Thought98.getInstance(lb0, lb1, fb0, fb1);
    boolean lb3 = false;
    lb0 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Output.points[2][4] -= fd1;
    lb0 = fb0 && fb1;
    double ld1 = 268.1361441024051;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
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
    Thought lo0 = Thought28.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    double ld1 = 995.326586786618;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3();
}
    Thought lo3 = Thought17.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);

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
