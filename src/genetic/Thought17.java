package genetic;
import java.util.ArrayList;
class Thought17 extends Thought{
private static ArrayList<Thought17> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 198.49762783582355;
private double fd1 = 656.6328562507767;
private Thought fo0 = null;
private Thought fo1 = null;
Thought17 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought17 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought17 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought17 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought17 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    double ld0 = 410.2030931376239;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    boolean lb2 = false;
    lb2 = fb0 || fb1;
    ld0 *= -1;
    lb1 = lb2 || fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = lb1 && lb2;
    double ld3 = 638.7297377726057;
        fb0 = fb1 || lb1;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought1.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb1 = ab1 && ab2;
if(fo0 != null){
      fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    ab2 = ab3 || ab4;
    double ld2 = 448.4213328451945;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb1, lb1, ab1, ab2);
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
    Output.points[3][4] += ad1;
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
        Thought lo1 = Thought0.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    lb0 = ad4 > fd0;
    fd1 *= -1;
    Thought lo2 = Thought18.getInstance();
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    fd1 = ad1 + ad2;
    lb0 = ad3 > ad4;
    fb0 = fb1 && lb0;

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
    ab2 = !ab3;
if(fo1 != null){
      ad1 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    Thought lo0 = Thought16.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 498.7808651026279;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
    fb0 = ad1 < ad2;
    fb1 = !ab1;
if(fo1 != null){
      fo1.m2();
}
    ab2 = ad3 > ad4;
    if (ab3) {
        ab4 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m2(fb0, fb1, ab1, ab2);
}
        ab3 = fd0 > fd1;
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
        fb1 = fd0 < fd1;
    if (fb0) {
if(ao2 != null){
          ao2.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        fb1 = fd0 < fd1;
        fb0 = fb1 && fb0;
        fb1 = fb0 && fb1;
        Output.points[3][5] -= fd0;
        double ld0 = 92.11180337479553;
        } else if (fb0) {
        boolean lb1 = false;
        Output.points[3][6] += fd1;
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
    fb1 = fb0 || fb1;
if(ao1 != null){
      ao1.m2();
}
    fb0 = fb1 || fb0;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
    fb1 = ad1 < ad2;
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fb1 = fd1 < ad1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought16.getInstance(ao4, fo0, fo1, ao1);
    double ld1 = 409.1192072836633;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    boolean lb2 = true;
    lb2 = ad4 < fd0;
    boolean lb3 = false;
    fd1 = ld1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb2);
}
    lb3 = fd1 < ld1;
    ad1 = ad2 - ad3;
    double ld4 = 40.82662222679841;
    double ld5 = 363.501171248027;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb2, lb3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld1, ld4, ld5);
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
    Output.points[3][7] += fd1;
    Thought lo0 = Thought17.getInstance();
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m3(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Output.points[3][8] -= fd1;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Output.points[4][0] += fd0;
    ab2 = fd1 < fd0;
    boolean lb1 = false;
if(ao2 != null){
      fd1 = ao2.m3();
}
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
    Thought lo2 = Thought13.getInstance(ab2, ab3, ab4, fb0);
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
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
    ad1 *= -1;
    ad2 = ad3 - ad4;
    ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    double ld0 = 661.3221680835533;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld1 = 852.5426381734414;
    boolean lb2 = true;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
      ld1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    Output.points[4][1] -= ad1;
    fb1 = ad2 < ad3;
    Thought lo3 = Thought12.getInstance(ad4, fd0, fd1, ld0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb2 = ab1 && ab2;
    double ld4 = 650.8247111674217;
    boolean lb5 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ld4, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 = ad4 - fd0;

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
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    Output.points[4][2] += fd1;
        fd0 = fd1 + fd0;
    fd1 *= -1;
    double ld1 = 156.52495109154765;

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
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 < fd0;
    double ld0 = 760.447921719551;
    Thought lo1 = Thought18.getInstance();
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    Thought lo2 = Thought7.getInstance();
    double ld3 = 913.8786938927129;
    ld3 *= -1;
    ab3 = fd0 < fd1;
    Thought lo4 = Thought2.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    ld0 = ld3 - fd0;
    ab2 = fd1 < ld0;

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
    ad2 *= -1;
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
    boolean lb0 = false;
        ad3 = ad4 + fd0;
    lb0 = fd1 > ad1;
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
    Output.points[4][3] += fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    fb0 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ad2 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 - ad3;
        boolean lb0 = false;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
        Thought lo1 = Thought19.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo0 != null){
          fo0.m3();
}
        double ld2 = 76.87358920794547;
        ab4 = !fb0;
        fb1 = !lb0;
        ab1 = fd0 < fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        fb1 = lb0 && ab1;
        ab2 = !ab3;
        Output.points[4][4] += ld2;
        ab4 = fb0 && fb1;
        ad1 *= -1;
        lb0 = ab1 && ab2;
        ad2 = ad3 + ad4;
        fd0 = fd1 - ld2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought7.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought7.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    double ld2 = 638.7971344120045;
    fb0 = fb1 && fb0;
    fd0 = fd1 + ld2;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1);
}
    fb0 = ld2 < fd0;
    fd1 *= -1;
    ld2 = fd0 + fd1;
    boolean lb3 = false;
if(fo1 != null){
      fo1.m1();
}
    ld2 *= -1;
    Thought lo4 = Thought9.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb3, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb3, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, ld2, fd0);
}

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought14.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    double ld1 = 25.000352868477425;
    fb1 = fb0 || fb1;
    if (fb0) {
        fb1 = fb0 && fb1;
        Output.points[4][5] += fd0;
        fb0 = !fb1;
        fd1 = ld1 - ad1;
        ad2 = ad3 - ad4;
        boolean lb2 = true;
        lb2 = fb0 || fb1;
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
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    double ld0 = 786.058056226144;
    Thought lo1 = Thought15.getInstance(ab2, ab3, ab4, fb0);
    fd0 = fd1 - ld0;
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ld0 - fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    ab3 = ab4 && fb0;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    Output.points[4][6] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fd1 = ad1 - ad2;
    fb0 = !fb1;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
    double ld1 = 915.7627931474144;
    boolean lb2 = true;
    ab3 = ab4 || fb0;
    fb1 = lb0 && lb2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld1;
    ab1 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb2;
        Thought lo3 = Thought18.getInstance(ab1, ab2, ab3, ab4);
    Output.points[4][7] += ad3;
    boolean lb4 = true;
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ld1, ad1);
}
    boolean lb5 = true;
    Output.points[4][8] += ad2;
    boolean lb6 = false;
    ab2 = !ab3;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2);
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
    Thought lo1 = Thought16.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    lb0 = fb0 && fb1;
    Thought lo2 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m1();
}
    fd0 *= -1;
    Thought lo3 = Thought4.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought7.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld3 = 529.3243850071798;
    ld3 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        ld3 *= -1;
        ab4 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2();
}
        lb0 = lb2 || ab1;
        double ld4 = 161.18448606896717;
        ld3 *= -1;
        fd0 *= -1;
        ab2 = !ab3;
        fd1 = ld4 + ld3;
        Thought lo5 = Thought5.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
        fd0 = fd1 + ld4;
        ld3 = fd0 + fd1;
        lb2 = ab1 || ab2;
}
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
    fb0 = fb1 && fb0;
    fb1 = ad2 < ad3;
    boolean lb0 = false;
    Thought lo1 = Thought2.getInstance(lb0, fb0, fb1, lb0);
    boolean lb2 = false;
    lb2 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    boolean lb3 = true;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, lb2, lb3, fb0);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ad1, lb0, lb2, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo4 = Thought18.getInstance();
    Output.points[5][0] += fd1;
    fb1 = lb0 && lb2;
    boolean lb5 = true;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, lb5, fb0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = false;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 45.1808126894468;
    ld1 = ad1 + ad2;
    ad3 *= -1;
    Output.points[5][1] -= ad4;
    Output.points[5][2] += fd0;
    fd1 = ld1 - ad1;
    ab1 = ad2 < ad3;
    ad4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb2 = true;
    fb0 = !fb1;
    lb0 = ld1 > ad1;

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
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m3();
}
    fb1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
if(ao4 != null){
      ao4.m2(fd1, fd0, fd1, fd0);
}
    lb0 = lb1 || fb0;
    fb1 = lb0 || lb1;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(ao4 != null){
          fd0 = ao4.m3(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
        Thought lo2 = Thought5.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
if(ao3 != null){
          fd1 = ao3.m3();
}
        fb1 = fd0 > fd1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb0 = fb1 || fb0;
    Thought lo0 = Thought3.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought15.getInstance(ao3, ao4, fo0, fo1);
    double ld2 = 258.7299163729958;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1, fb0, fb1, fb0, fb1);
}
    Output.points[5][3] += ad2;
    Thought lo3 = Thought17.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    Output.points[5][4] += ld2;
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld2);
}
    boolean lb4 = true;
    ad1 = ad2 - ad3;
    boolean lb5 = false;
    lb4 = !lb5;
    Thought lo6 = Thought4.getInstance();
    fb0 = !fb1;

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
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 && ab1;
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
        Output.points[5][5] -= fd0;
        Output.points[5][6] += fd1;
    ab3 = ab4 || fb0;
if(ao3 != null){
      fb1 = ao3.m2(fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
    Thought lo2 = Thought6.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);

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
    boolean lb0 = false;
if(ao2 != null){
      ad2 = ao2.m3();
}
    double ld1 = 894.1004326551854;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
    boolean lb2 = true;
    double ld3 = 476.18117144920615;
    Thought lo4 = Thought14.getInstance(ab3, ab4, fb0, fb1);
    boolean lb5 = true;
    lb0 = ad2 < ad3;
    double ld6 = 793.4671154045626;
    lb2 = !lb5;
    ab1 = ad3 < ad4;
    fd0 = fd1 - ld1;
    ab2 = ab3 || ab4;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 249.3958473132012;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    ld0 = fd0 + fd1;
    Output.points[5][7] += ld0;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    fd1 *= -1;
    if (fb0) {
        ld0 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
        lb1 = !fb0;
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
        fd1 *= -1;
        double ld2 = 669.8909813935188;
        ld2 = ld0 + fd0;
        } else {
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
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
        lb1 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && lb0;

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
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    lb0 = lb1 || fb0;
    ad1 = ad2 - ad3;
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    ad4 *= -1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    Thought lo3 = Thought17.getInstance(fo1, fo0, fo1, fo0);
    Output.points[5][8] -= ad2;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb4, fb0, fb1, lb0);
}
    ad1 *= -1;
if(fo1 != null){
      lb1 = fo1.m2(ad2, ad3, ad4, fd0, lb2, lb4, fb0, fb1);
}
    boolean lb5 = true;
    lb0 = fd1 > ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    lb1 = !lb2;

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
if(fo0 != null){
      fo0.m2();
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    ab1 = fd0 > fd1;
    Output.points[6][0] -= ad1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    ab2 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought12.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld2 = 824.8669935192852;
    for(int i0=0; i0<10; i0++){
        lb0 = ab1 && ab2;
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
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    fd1 *= -1;
    fb0 = !fb1;
    boolean lb1 = true;
    lb0 = !lb1;
    fd0 = fd1 + fd0;
    double ld2 = 162.91156946618207;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        ld2 = fd0 + fd1;
        boolean lb3 = true;
        Thought lo4 = Thought7.getInstance();
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb3, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      ad1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought15.getInstance(ao4, fo0, fo1, ao1);
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought8.getInstance();
    fb1 = fb0 && fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld2 = 385.71743531460214;
    fb0 = !fb1;
    Thought lo3 = Thought13.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld2, ad1);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1, fb1, fb0, fb1, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fd0 *= -1;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    double ld1 = 445.86912332854126;
    ld1 = fd0 + fd1;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;
    fd0 = fd1 - ld1;
    ab4 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ld1 *= -1;
    boolean lb3 = false;
    ab4 = fd0 < fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Output.points[6][1] += ad1;
    fb1 = ab1 && ab2;
    double ld0 = 189.66814002187968;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    Output.points[6][2] -= ad1;
    ab1 = ab2 && ab3;
    boolean lb1 = true;
    ab3 = ab4 || fb0;
    ad2 = ad3 + ad4;
    Output.points[6][3] += fd0;
if(ao4 != null){
      ao4.m2(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2(ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
    Output.points[6][4] -= ad4;
    double ld2 = 512.5998477514661;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0);
}
        Thought lo3 = Thought11.getInstance();
        ab1 = ld2 < ad1;
        boolean lb4 = false;
        ab1 = ad2 > ad3;
if(ao4 != null){
          ab2 = ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
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
    fd1 = fd0 - fd1;
    double ld0 = 694.5177490031174;
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
    fb0 = fb1 || fb0;
    double ld1 = 837.3607517734728;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0);
}
    fb1 = !fb0;
    ld1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[6][5] += fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    fb0 = ld0 > ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    boolean lb3 = true;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd0 < fd1;
    ld0 = ld1 + fd0;
    lb2 = !lb3;
    Thought lo4 = Thought17.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb3);
}
    double ld5 = 746.0711161796487;
    fb0 = fd0 < fd1;

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
    fd0 *= -1;
    fb1 = fb0 && fb1;
        Thought lo0 = Thought5.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 302.5730072665098;
    fb1 = fb0 && fb1;
    ld1 = fd0 - fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
    lb2 = fd0 < fd1;
    Thought lo3 = Thought11.getInstance();
    double ld4 = 881.3094522230662;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
    fb1 = ld4 > fd0;
    boolean lb5 = false;
    lb2 = fd1 < ld1;
    double ld6 = 128.88090648594297;
if(fo1 != null){
          fo1.m3(lb5, fb0, fb1, lb2);
}
    ld4 = ld6 + fd0;

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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought6.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    boolean lb3 = false;
    double ld4 = 96.33174488681752;
    boolean lb5 = true;
    Output.points[6][6] += fd0;
if(fo1 != null){
      lb0 = fo1.m2(fd1, ld4, fd0, fd1, lb2, lb3, lb5, fb0);
}
    boolean lb6 = true;
        ld4 = fd0 - fd1;
    Thought lo7 = Thought19.getInstance(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4);

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
